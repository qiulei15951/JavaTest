import java.util.*;
/*
�����⣺
����һ����������飬������������д洢һ��Ԫ�أ�����֤������黹������ģ�
��ô���Ԫ�صĴ洢�ĽǱ�Ϊ��λ�ȡ��
*/


class ArrayDemo5
{
	public static void main(String[] args) 
	{
		//int[] arr = {3,4,6,23,545,323};
		int[] arr = {1,3,4,5,6,7,8,34};
		int index = halfSearch_2(arr,6);
		System.out.println("index="+index);

		int index1 = Arrays.binarySearch(arr,6);//������ڷ��صľ���Ľű�λ�ã��������򷵻ص���  -�����-1
		System.out.println("index="+index1);
	}
	/*
	���ֲ��ҷ���

	*/
	public static int halfSearch(int[] arr,int key)
	{
		int max,min,mid;
		min = 0;
		max = arr.length - 1;
		mid = (max + min)/2;

		while (arr[mid] != key)
		{
			if (key > arr[mid])
				min = mid + 1;
			else if (key < arr[mid])
				max = mid - 1;			

			if (max < min)
				return -1;

			mid = (max + min)/2;
		}
		return mid;
	}

	public static int halfSearch_2(int[] arr,int key)
	{
		int max,min,mid;
		min = 0;
		max = arr.length - 1;

		while(min<=max)
		{
			mid = (max+min)>>1;

			if (key > arr[mid])
				min = mid + 1;
			else if (key < arr[mid])
				max = mid - 1;
			else 
				return mid;
		}
		return min;
	}



	/*
	���鳣�����ܣ�����
	*/
	public static int getIndex(int[] arr,int key)
	{
		for (int x = 0; x < arr.length ; x++ )
		{
			if(arr[x]==key)
				return x;
		}
		return -1;
	}
}
