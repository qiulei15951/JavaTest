//基本数据类型参数传递
class Damo 
{
	public static void main(String[] args) 
	{

		int x = 3;
		System.out.println("x="+x);
	}
	public static void show(int x)
	{
		x = 4;
	}
}

//引用数据类型参数传递
class Demo
{
	int x = 3;
	public static void main(String[] args)
	{
		Demo d = new Demo();
		show(d);
		System.out.println(d,x);
	}
	public static void show(Demo d)
	{
		d.x = 4;
	}
}
