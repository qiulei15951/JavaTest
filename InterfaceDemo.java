
/*
abstract class AbsDemo
{
	abstract void show1();
	abstract void show2();
}

��һ���������еķ������ǳ����ʱ����ʱ���Խ��ó�������
��һ����ʽ����ͱ�ʾ������ �ӿ� interface 
*/

/*����ӿ�ʹ�õĹؼ��ֲ���class����interface

���ڽӿڵ��г����ĳ�Ա��������Щ��Ա���й̶������η���
1.ȫ�ֳ�����public static final

2.���󷽷���public abstract

�ɴ˵ó����ۣ��ӿ��еĳ�Ա���ǹ�����Ȩ�ޡ�
*/

interface Demo
{
	public static final int NUM = 5;

	public abstract void show1();
	public abstract void show2();
}
//������֮���Ǽ̳й�ϵ�� ����ӿ�֮����ʵ�ֹ�ϵ��
/*
�ӿڲ�����ʵ������

ֻ����ʵ���˽ӿڵ����ಢ�����˽ӿ������еĳ��󷽷��󣬸�����ſ���ʵ������
��������������һ�������ࡣ

*/
class DemoImpl implements /*ʵ��*/ Demo
{
	public void show1()
	{

	}
	public void show2()
	{

	}
}

/*
��java�в�ֱ��֧�ֶ�̳У���Ϊ����ֵ��õĲ�ȷ���ԡ�
����java����̳л��ƽ��и�������java�б���˶�ʵ�֡�

һ�������ʵ�ֶ���ӿڡ�


*/
interface A
{
	public abstract void show();
	
}

interface B
{
	public abstract void show();
}

class Test implements A,B//��ʵ��
{
	public void show()
	{
		System.out.println("hahaha");
	}
}


/*
һ�����ڼ̳���һ�����ͬʱ��������ʵ�ֶ���ӿڡ�



*/
class Q
{
	public void method(){}
}
class Test2 extends Q implements A,B
{
	public void show(){}

}
/*
�ӿڵĳ��ֱ����˵��̳еľ����ԡ�

*/

interface CC
{
	public abstract void show();
}
interface MM
{
	public abstract void method();
}

interface QQ extends CC,MM//�ӿ���ӿ�֮���Ǽ̳й�ϵ�����ҽӿڿ��Զ�̳С�
{
	void function(){}
}

class WW implements QQ
{
	//����3������
	public void show(){}
	public void method(){}
	public void function(){}
}


class  InterfaceDemo
{
	public static void main(String[] args) 
	{
		Test t = new Test();
		t.show();

		//DemoImpl d = new DemoImpl();
		//System.out.println(d.NUM);
		//System.out.println(DemoImpl.NUM);
		//System.out.println(Demo.NUM);
		
	}
}
