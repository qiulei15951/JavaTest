


class Demo
{
	public static int method(int[] arr,int index)
	{
		//System.out.println(arr[index]);
		//System.out.println("hahaha");
		if (arr == null)
		{
			throw new NullPointerException("��������ò���Ϊ�գ�");
		}
		if (index >= arr.length)
		{
			throw new ArrayIndexOutOfBoundsException("����ĽǱ�Խ���������ǣ����ǲ��Ƿ��ˣ�"+index);
		}
		if (index < 0)
		{
			throw new ArrayIndexOutOfBoundsException("����ĽǱ겻��Ϊ���������ǣ���������ˡ�"+index);
		}

		return arr[index];

	}
}


class ExceptionDemo2 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[3];
		
		Demo d = new Demo();
		int num = d.method(null,-30);
		System.out.println("num="+num);
		System.out.println("fdfd");
	}
	
}
