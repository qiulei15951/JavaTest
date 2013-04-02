
/*
�����ߣ������ߡ�

�������ߣ������������⡣

if�жϱ�ǣ�ֻ��һ�Σ��ᵼ�²��õ��߳������ˣ����������ݴ���������
while�жϱ�ǣ�������̻߳�ȡִ��Ȩ���Ƿ�Ҫ���У�

notify��ֻ�ܻ���һ���̣߳�������������˱�����û�����壬����while�жϱ��+notify�ᵼ��������
notifyAll����˱����߳�һ���ỽ�ѶԷ��̵߳����⡣



*/
import java.util.concurrent.locks.*;

class Resource
{
	private String name;
	private int count;
	private boolean flag = false;

//	����һ��������
	Lock lock = new ReentrantLock();

	//ͨ�����е�����ȡ�����ϵļ���������
	//Condition con = lock.newCondition();

	//ͨ�����е�����ȡ�����������һ����������ߣ�һ����������ߡ�
	Condition producer_con = lock.newCondition();
	Condition consumer_con = lock.newCondition();


	public void set(String name)//
	{
		lock.lock();
		try
		{
			while(flag)
			//	try{this.wait();}catch (InterruptedException e){}//t0(��) t1   
				try{producer_con.await();}catch (InterruptedException e){}//t0(��) t1   
			this.name = name + count;//��Ѽ1   ��Ѽ2   ��Ѽ3
			count++;//2   3
			System.out.println(Thread.currentThread().getName()+"...������......"+this.name);//������Ѽ1   ������Ѽ2   ������Ѽ3
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
			System.out.println(Thread.currentThread().getName()+"...������..."+this.name);//���ѿ�Ѽ1
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
			r.set("��Ѽ");
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



