
/*
��java���Զ���ʵ�����е������������
ͨ�������ʽ�����ֵġ�

��ô�����أ�
������������ͨ��ֻ��ע�����档
һ�����ԣ�һ����Ϊ��

��Ҫ��ȷ����������Ժ���Ϊ�����������м��ɡ�

������ʵ���Ǹ�������ʵʵ���ڴ��ڵĸ��塣

�������֮��Ĺ�ϵ��
�ࣺ�����������
���󣺸��������ʵ������java��ͨ��new�������ġ�
*/

/*
����С����

������
1.���ԣ�
	��̥����
	��ɫ��
2.��Ϊ��
	���С�



��������ʵ�����ڶ������еĳ�Ա��
��Ա����Ա������--�����ԣ���Ա������--����Ϊ��


��Ա�����;ֲ�����������

1.
��Ա�������������У��������ж����Է��ʡ�
�ֲ����������ں�������䣬�ֲ�������У�ֻ��������������Ч��

2.
��Ա���������ڶ��ڴ�Ķ����С�
�ֲ�����������ջ�ڴ�ķ����С�

3.
��Ա�������Ŷ���Ĵ��������ڣ����Ŷ������ʧ����ʧ��
�ֲ������������������ִ�ж����ڣ�������������Ľ�������ͷš�

4.
��Ա��������Ĭ�ϳ�ʼ��ֵ��
�ֲ�����û��Ĭ�ϳ�ʼ��ֵ��


*/
class Car
{
	int num;
	String color;

	void run()
	{
		System.out.println(num+"..."+color);
	}
}



class  CarDemo
{
	public static void main(String[] args) 
	{
		//�ڼ�����д���һ��car��ʵ����ͨ��new�ؼ��֡�
		//Car c = new Car();//c����һ�������͵����ñ�����ָ���˸���Ķ���
		//c.num = 4;
		//c.color = "red";

		//c.run();//Ҫʹ�ö����е����ݿ���ͨ����  ����.��Ա����ʽ����ɵ��á�
		

		//Car c1 = new Car();
		//c1.num = 4;
		//c1.color = "red";

		//Car c2 = new Car();
		//c2.num = 4;
		//c2.color = "red";

		//Car c1 = new Car();
		//Car c2 = new Car();
		//show(c1);
		//show(c2);

		/*
		��������û�����ֵĶ���
		new Car();//����������ʵ���Ƕ������ļ�д��ʽ��



		Car c = new Car();
		c.run();

		new Car().run();

		1.������Է���������һ�ε��õ�ʱ�򣬾Ϳ��Լ򻯳���������

		new Car().num = 5;
		new Car().color = "green";
		new Car().run();

		2.����������Խ�����Ϊʵ�ʲ������д��ݡ�

		//Car c1 = new Car();
		//show(c1);

		show(new Car());
		*/


	}

	//�������쳧��
	public static void show(Car c)//�����͵ı���һ��ָ�����Ҫ������null
	{
		c.num = 3;
		c.color = "black";
		System.out.println(c.num+"...."+c.color);
	}

}