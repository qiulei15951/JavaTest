
//成员函数
/*
当子父类中出现成员函数一模一样的情况，会运行子类的函数。
这种现象，称为覆盖操作。这是函数在子父类中的特性。
函数两个特性：
	1.重载。同一个类中。
	2.覆盖。子类中，覆盖也称为重写。覆写override

覆盖注意事项：
1.子类方法覆盖父类方法时，子类权限必须大于等于父类的权限。
2.静态只能覆盖静态，或被静态覆盖。




*/
class Fu
{
	static void show()
	{
		System.out.println("fu show run");
	}
}

class Zi extends Fu
{
	static void show()
	{
		System.out.println("zi show run");
	}
}


class ExtendsDemo3 
{
	public static void main(String[] args) 
	{
		//Zi z = new Zi();
		//z.show();
		NewPhone p = new NewPhone();
		p.show();
	}
}


/*
什么时候使用覆盖操作。

当对一个类进行子类的扩展时，子类需要保留父类的功能申明。
但是要定义子类中该功能的特有内容是，就使用覆盖操作完成。


*/
class Phone
{
	void call(){}
	void show()
	{
		System.out.println("number");
	}
}

class NewPhone extends Phone
{
	void show()
	{
		
		System.out.println("name");
		System.out.println("pic");
		super.show();

	}
}
