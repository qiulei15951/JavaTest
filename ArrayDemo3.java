class ArrayDemo3 
{
	public static void main(String[] args) 
	{
		//��ʽ1
		/*
		��Ҫһ�����������ǲ���ȷ�����ľ������ݡ�
		*/
		//int[] arr = new int[3];
		
		/*
		��Ҫһ���������洢��֪�ľ������ݡ�
		*/
		//Ԫ������[] ������ = new Ԫ������[](Ԫ�أ�Ԫ��);
		//int[] arr = new itn[](45,42,3,4,2);
		int[] arr = {45,42,3,4,2};

		/*
		���������������Ķ������Ǵ��ȡ��
		����˼�룺���ǶԽǱ�Ĳ�����

		*/
		System.out.println("length="+arr.length);
		for (int x = 0; x < arr.length ; x++ )
		{
			System.out.println("arr["+x+"]="+arr[x]+";");

		}

		System.out.println("length="+arr.length);
		for (int x = arr.length-1; x >= 0 ; x-- )
		{
			System.out.println("arr["+x+"]="+arr[x]+";");

		}
		//System.out.println(arr[1]);
		//System.out.println(arr[2]);
		//System.out.println(arr[3]);
	}
}
