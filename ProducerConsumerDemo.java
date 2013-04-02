
/*
生产者，消费者。

多生产者，多消费者问题。

if判断标记，只有一次，会导致不该的线程运行了，出现了数据错误的情况。
while判断标记，解决了线程获取执行权后，是否要运行！

notify：只能唤醒一个线程，如果本方唤醒了本方，没有意义，而且while判断标记+notify会导致死锁。
notifyAll解决了本方线程一定会唤醒对方线程的问题。



*/
import java.util.concurrent.locks.*;

class Resource
{
	private String name;
	private int count;
	private boolean flag = false;

//	创建一个锁对象
	Lock lock = new ReentrantLock();

	//通过已有的锁获取该锁上的监视器对象。
	//Condition con = lock.newCondition();

	//通过已有的锁获取两组监视器，一组监视生产者，一组监视消费者。
	Condition producer_con = lock.newCondition();
	Condition consumer_con = lock.newCondition();


	public void set(String name)//
	{
		lock.lock();
		try
		{
			while(flag)
			//	try{this.wait();}catch (InterruptedException e){}//t0(活) t1   
				try{producer_con.await();}catch (InterruptedException e){}//t0(活) t1   
			this.name = name + count;//烤鸭1   烤鸭2   烤鸭3
			count++;//2   3
			System.out.println(Thread.currentThread().getName()+"...生产者......"+this.name);//生产烤鸭1   生产烤鸭2   生产烤鸭3
			flag = true;
			//notifyAll();
			producer_con.signalAll();
		}
		finally
		{
			lock.unlock();
		}
		

		
	}

	public void out()//   t3
	{
		lock.lock();
		try
		{
			while(!flag)
				//try{this.wait();}catch (InterruptedException e){}   //t2  t3
				try{consumer_con.await();}catch (InterruptedException e){}   //t2  t3
			System.out.println(Thread.currentThread().getName()+"...消费者..."+this.name);//消费烤鸭1
			flag = false;
			//notifyAll();
			consumer_con.signalAll();
		}
		finally
		{
			lock.unlock();
		}


	}
}

class Producer implements Runnable
{
	private Resource r;
	Producer(Resource r)
	{
		this.r = r;
	}
	public void run()
	{
		while(true)
		{
			r.set("烤鸭");
		}
	}
}

class Consumer implements Runnable
{
	private Resource r;
	Consumer(Resource r)
	{
		this.r = r;
	}
	public void run()
	{
		while(true)
		{
			r.out();
		}
	}
}


class  ProducerConsumerDemo
{
	public static void main(String[] args) 
	{
		Resource r = new Resource();
		Producer pro = new Producer(r);
		Consumer con = new Consumer(r);

		Thread t0 = new Thread(pro);
		Thread t1 = new Thread(pro);
		Thread t2 = new Thread(con);
		Thread t3 = new Thread(con);
		t0.start();
		t1.start();
		t2.start();
		t3.start();
	}
}



