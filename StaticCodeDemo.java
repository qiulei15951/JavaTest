
/*
��̬����顣
	������ļ��ض�ִ�С�����ִֻ��һ�Ρ�

���á�
	���ڸ�����г�ʼ����


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

	{//�������顣���Ը����ж�����г�ʼ���ġ�
		//System.out.println("person run");
		cry();
	}


	Person()//�Ǹ���Ӧ�Ķ����������Եĳ�ʼ����
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
		System.out.println("����");
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
		Person p2 = new Person("����");
		p2.speak();
		new Person();
		p2.show();

		//new StaticCode().show();
		//new StaticCode().show();
		//StaticCode.show();
		//System.out.println("b");
	}
}
