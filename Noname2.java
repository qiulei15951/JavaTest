
/*

����Ķ�̬�ԡ�



class ����
{}

class è extends ����
{}
class �� extends ���� 
{}



è x = new è();
���� x = new è();//һ������������̬


è�������Ｔ�߱���è����̬���־߱��Ŷ������̬
����Ƕ���Ķ�̬�ԡ�

��˵������һ�������Ӧ�Ų�ͬ���͡�


��̬�ڴ����е����֣�
	������߽ӿڵ�����ָ��������Ķ���

*/


class Animal
{
	abstract void eat();
}

class Dog extends Animal
{
	void eat()
	{
		System.out.println("�й�ͷ");
	}
	void lookHome()
	{
		System.out.println("����");
	}
}

class Cat extends Animal
{
	void eat()
	{
		System.out.println("����");
	}
	void catchMouse()
	{
		System.out.println("׽����");
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
