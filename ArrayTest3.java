class ArrayTest3 
{
	public static void main(String[] args) 
	{
		toHex(20);
		toBinary(20);
		toOctal(20);
		System.out.println(Integer.toBinaryString(20));
	}

	//ʮ����--��ʮ������
	public static void toHex(int num)
	{
		trans(num,15,4);
	}
	//ʮ����--��������
	public static void toBinary(int num)
	{
		trans(num,1,1);
	}
	//ʮ����--���˽���
	public static void toOctal(int num)
	{
		trans(num,7,3);
	}

	public static void trans(int num, int base, int offset)
	{
		if (num == 0)
		{
			System.out.println("0");
			return;
		}
		//����һ����Ӧ��ϵ��
		char[] chs = {'0','1','2','3','4',
					'5','6','7','8','9',
					'A','B','C','D','E','F'};
		/*
		һ�����鵽�Ƚ϶�����ݡ�
		����һ�࣬�ʹ洢�������ڽ��в�����
		���Զ���һ�����飬  ��ʱ����
		*/

		char[] arr = new char[32];
		int pos = arr.length;
		while(num != 0)
		{
			int temp = num & base;
			arr[--pos] = chs[temp];
			num = num >>> offset;
		}
		for (int x = pos; x < arr.length ;x++ )
		{
			System.out.print(arr[x]);
		}
		System.out.println();

	}


}
