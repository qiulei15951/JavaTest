class  FunctionDemo3
{
	public static void main(String[] args) 
	{
		//System.out.println(add(3,5));
		//draw(5,4);
		//System.out.println(equals(3,5));
		System.out.println(getLevel(67));
		//abc();
		
	}

	/*
	����1������һ�����ܣ�������������ĺ͵Ļ�ȡ
	˼·����Ȼ���幦�ܣ����ǿ����ú���������
		��ζ���һ�������أ�
		ͨ��������ȷ����ɡ�
	��ȷһ��������ܵĽ����ʲô���Ǻ͡��ǹ��ܵĽ�������Ըù��ܵķ���ֵ������int��
	��ȷ�����������ʵ�ֹ������Ƿ���Ҫδ֪���ݲ������㣿�У������ͱ��������������ĸ��������������ͣ�

	ע�⣺����ֵ���ͺͲ�������û��ֱ�ӹ�ϵ
	*/
	public static int add(int a , int b)
	{
		int sum = a + b;
		return sum;
	}

	/*
	����2������һ�����ܣ���һ�������ڿ���̨
	��ȷһ��������ܵĽ����ʲô��
		û�н������Ϊֱ�Ӵ�ӡ���ˣ�����̨����δ���ظ�������
		��void
	��ȷ�����������ʵ�ֹ������Ƿ���Ҫδ֪���ݲ������㣿
		�У��к��в�ȷ�������������� int
	*/

	public static void draw(int row , int col)
	{
		for (int x = 1; x <= row ; x++ )
		{
			for (int y = 1;y <= col ;y++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/*
	����3������һ�����ܣ��Ƚ��������Ƿ����
	��ȷһ��������ܵĽ����ʲô��
		�У�boolean
	��ȷ�����������ʵ�ֹ������Ƿ���Ҫδ֪���ݲ������㣿
		�У���������
	*/
	public static boolean equals(int a, int b)
	{
		/*
		if (a==b)
		{
			return true;
		}else
		{
			return false;
		}
		*/
		//return (a==b)?true:false;

		return a==b;
	}


	/*
	����4������һ�����ܣ���ȡ���������нϴ���Ǹ�����
	��ȷһ��������ܵĽ����ʲô��
		�У�����һ������int
	��ȷ�����������ʵ�ֹ������Ƿ���Ҫδ֪���ݲ������㣿
		�У�����Ƚϵ��������� int
	*/
	public static int getMax(int a, int b)
	{
		/*
		if (a > b)
		{
			return a;
		}else
		{
			return b;
		}
		*/
		return a<b?a:b;
	}

	/*���幦�ܣ���ӡ99�˷���

	*/
	public static void abc()
	{
		for (int x = 1; x <= 9 ; x++ )
		{
			for (int y = 1; y <= x ; y++ )
			{
				System.out.print(y+"*"+x+"="+x*y+"\t");
			}
			System.out.println();
		}
	}

	/*
	���ݿ��Գɼ���ȡѧ��������Ӧ�ĵȼ�
	90~100      A
	80~89       B
	70~79		C
	60~69	    D
	60����      E

	������ȼ� ���ַ� char
	���������� int
	*/
	public static char getLevel(int sum)
	{
		char level;
		if (sum >= 90 && sum <= 100)
			level = 'A';
		else if (sum >= 80 && sum <= 89)
			level = 'B';
		else if (sum >= 70 && sum <= 79)
			level = 'C';
		else if (sum >= 60 && sum <= 69)
			level = 'D';
		else 
			level = 'E';
		return level;
	}
}
