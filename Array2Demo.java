
/*
��ά���鶨��ĸ�ʽ
*/


class  Array2Demo
{
	public static void main(String[] args) 
	{
		//int[] arr = new int[3];
		//System.out.println(arr);//[I@128f6ee  @�����ʵ������ͣ� @�ұ���ʵ��Ĺ�ϣֵ


		//int[][] arr = new int[3][2];//����һ����ά���飬����������3��һά���飬ÿһ��һά��������2��Ԫ�ء�

		//System.out.println(arr);//ֱ�Ӵ�ӡ��ά����   [I@128f6ee
		//System.out.println(arr[0]);//ֱ�Ӵ�ӡ��ά�����еĽǱ�0��һά���顣[I@128f6ee
		//System.out.println(arr[0][0]);//ֱ�Ӵ�ӡ��ά�����еĽǱ�0��һά�����нǱ�Ϊ0��Ԫ�ء� 0
	

		//int[][] arr = new int[3][];//����һ����ά���飬����������3��һά���飬ÿһ��һά��������2��Ԫ�ء�

		//System.out.println(arr);//ֱ�Ӵ�ӡ��ά����   [I@128f6ee
		//System.out.println(arr[0]);//ֱ�Ӵ�ӡ��ά�����еĽǱ�0��һά���顣null
		//System.out.println(arr[0][0]);//ֱ�Ӵ�ӡ��ά�����еĽǱ�0��һά�����нǱ�Ϊ0��Ԫ�ء� NullPointerException


		//int[][] arr = new int[3][2];

		//System.out.println(arr.length);//��ӡ��ά����ĳ��ȡ� ��ʵ����һά����ĸ���
		//System.out.println(arr[1].length);//��ӡ��ά�����нǱ�Ϊ1һά����ĳ���

		int[][] arr = {{3,1,7},{5,8,2,9},{4,1}};
		int sum = 0;

		for (int x = 0; x < arr.length ; x++ )
		{
			for (int y = 0; y < arr[x].length ; y++ )
			{
				//System.out.print(arr[x][y]+",");
				sum += arr[x][y];
			}
		}
		System.out.println("sum="+sum);


		//�ף�30 59 28 17
		//�ң�37 60 22 19
		//int[][] arr = {{30,59,28,17},{37,60,22,19}};
	}
}