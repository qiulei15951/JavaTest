
/*
内部类可以存放在局部位置上。
内部类在局部位置上只能访问局部中被final修饰的局部变量。
*/


class Outer
{
	int num = 3;
	Object method(final int y)
	{
		final int x = 9;

		class Inner
		{
			void show()
			{
				System.out.println("show....."+y);
			}
		}

		Object in = new Inner();
		return in;//0x0045
		//in.show();
	}
	
}



class InnerClassDemo3 
{
	public static void main(String[] args) 
	{
		//Outer out = new Outer();
		//Object obj = out.method();
	}
}

/*

class Fu extends Object
{
}
class Zi extends fu
{
}


Fu f = new Zi();

Object o = new Fu();
*/