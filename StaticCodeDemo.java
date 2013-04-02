
/*
静态代码块。
	随着类的加载而执行。而且只执行一次。

作用。
	用于给类进行初始化。


*/
class StaticCode
{
	static int num;
	static
	{
		num = 10;
		System.out.println("hahaha");
	}

	static void show()
	{
		System.out.println(num);
	}
}


class Person
{
	private String name;

	{//构造代码块。可以给所有对象进行初始化的。
		//System.out.println("person run");
		cry();
	}


	Person()//是给对应的对象进行针对性的初始化。
	{
		name = "baby";
		//cry();
	}

	Person(String name)
	{
		this.name = name;
		//cry();
	}

	public void cry()
	{
		System.out.println("哇哇");
	}

	public void speak()
	{
		System.out.println("name:"+name);
	}
	static void show()
	{
		System.out.println("show run");
	}
}


class StaticCodeDemo 
{
	static 
	{
		//System.out.println("a");
	}
	public static void main(String[] args) 
	{
		Person p1 = new Person();
		p1.speak();
		Person p2 = new Person("旺财");
		p2.speak();
		new Person();
		p2.show();

		//new StaticCode().show();
		//new StaticCode().show();
		//StaticCode.show();
		//System.out.println("b");
	}
}
