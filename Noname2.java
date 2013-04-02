
/*

对象的多态性。



class 动物
{}

class 猫 extends 动物
{}
class 狗 extends 动物 
{}



猫 x = new 猫();
动物 x = new 猫();//一个对象，两种形态


猫这类事物即具备者猫的形态，又具备着动物的形态
这就是对象的多态性。

简单说：就是一个对象对应着不同类型。


多态在代码中的体现：
	父类或者接口的引用指向其子类的对象。

*/


class Animal
{
	abstract void eat();
}

class Dog extends Animal
{
	void eat()
	{
		System.out.println("啃骨头");
	}
	void lookHome()
	{
		System.out.println("看家");
	}
}

class Cat extends Animal
{
	void eat()
	{
		System.out.println("吃鱼");
	}
	void catchMouse()
	{
		System.out.println("捉老鼠");
	}
}




class  
{
	public static void main(String[] args) 
	{
		Cat c = new Cat();
		c.eat();
	}
}
