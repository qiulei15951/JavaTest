class FunctionDemo4
{
	public static void main(String[] args)
	{
		
		printCFB(2);
	}

	/*
	����������


	1.ͬһ����
	2.ͬ��
	3.����������ͬ  or   �������Ͳ�ͬ
	4.�������غͷ���ֵ�����޹�
	5.java���Ͻ������ԣ�����������ֵĵ��õĲ�ȷ���ԣ������ʧ�ܡ�
	*/

	//�ӷ����㡣���������ĺ�
	public static int add(int a , int b)
	{
		return a + b; 
	}


	//�ӷ����㡣����С���ĺ�
	public static double add(double a , double b)
	{
		return a + b;
	}

	//�ӷ����㡣���������ĺ�
	public static int add(int a ,int b , int c)
	{
		return a + b + c;
	}

	/*
	��ӡ�˷���
	*/
	public static void printCFB(int num)
	{
		for (int x = 1;x <= num ; x++)
		{
			for (int y = 1;y <=x ;y++)
			{
				System.out.print(y+"*"+x+"="+y*x+"\t");
			}
				System.out.println();
		}
	}
	/*
	public static void printCFB()
	{
		for (int x = 1;x <= 9 ; x++)
		{
			for (int y = 1;y <=x ;y++)
			{
				System.out.print(y+"*"+x+"="+y*x+"\t");
			}
				System.out.println();
		}
	}
	*/
	public static void printCFB()
	{
		printCFB(9);
	}


}