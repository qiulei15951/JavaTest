class ArrayDemo4 
{
	//��������Ĺ��ܡ�
	public static void printArray(int[] arr)
	{
		System.out.print("[");
		for (int x = 0 ; x < arr.length ; x++ )
		{
			if(x!=arr.length-1)
				System.out.print(arr[x]+",");
			else
				System.out.println(arr[x]+"]");
		}
	}

	public static void main(String[] args) 
	{
		int[] arr = {134,24,89,23,32};

		//int max = getMax2(arr);
		//System.out.println("Max="+max);

		printArray(arr);
		//selectSrot(arr);
		bubbleSort(arr);
		printArray(arr);
		
	}
	public static void swap(int[] arr,int a , int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	/*
	ð������
	*/
	public static void bubbleSort (int[] arr)
	{
		for (int x = 0; x < arr.length-1 ; x++ )
		{
			for (int y = 0; y < arr.length-1-x ;x++ )
			{

				if (arr[y] > arr[y+1] )
				{
					swap(arr,y,y+1);
					/*
					int temp = arr [y];
					arr[y] = arr[y+1];
					arr[y+1] = temp;
					*/
				}
			}
		}
	}

	/*
	ѡ������
	
	*/
	public static void selectSrot(int[] arr)
	{
		for (int x = 0; x < arr.length-1 ; x++ )
		{
			for (int y = x + 1; y < arr.length ; y++ )
			{
				if (arr[x] > arr[y])
				{
					swap(arr,x,y);
					/*
					int temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;
					*/
				}
			}
		}
	}




	/*
	���ܣ���ȡ�����е����ֵ
	˼·��
	1.��Ҫ���бȽϣ������������¼סÿ�αȽϺ�ϴ��ֵ
	2.�������е�Ԫ�ؽ��б���ȡ�����ͱ����м�¼��Ԫ�ؽ��бȽϡ�
		�����������Ԫ�ش��ڱ����м�¼��Ԫ�أ����ñ�����¼ס�ô��ֵ
	3.����������ñ�����¼�������ֵ��

	����һ��������ʵ�֡�
	��ȷһ�����
			�������е�Ԫ�ء�int
	��ȷ����δ֪����
			����
	*/

	public static int getMax(int[] arr)
	{
		//���������¼�ϴ��ֵ��
		int maxFlement = arr[0];
		for (int x = 0; x < arr.length ; x++ )
		{
			if(arr[x] > maxFlement)
				maxFlement = arr[x];
		}
		return maxFlement;
	}

	public static int getMax2(int[] arr)
	{
		//���������¼�ϴ��ֵ��
		int maxIndex = 0;
		for (int x = 1; x < arr.length ; x++ )
		{
			if(arr[x] > arr[maxIndex])
				maxIndex = x;
		}
		return arr[maxIndex];
	}
}
