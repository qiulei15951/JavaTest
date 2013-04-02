class BreakContinueDemo
{
	public static void main(String[] args)
	{
		/*
		for(int a = 0; a < 3; a++)
		{
			if(a==1)
			{
				break;
			}
			System.out.println("a="+a);
		}
		*/
		/*
		xiaoqiang:for(int x = 0; x < 3; x++)
		{
			wangcai:for(int y = 0; y < 4; y++)
			{
				System.out.println("x="+x);
				break xiaoqiang;
			}
		}
		*/

		/*
		continue;继续
		作用的范围；循环结构
		continue;结束本次循环，继续下次循环
		如果continue单独存在时，下面不要有任何语句，因为执行不到
		

		for(int x = 0; x < 11; x++)
		{
			if (x%2==0)
				continue;
			System.out.println("x="+x);
			
		}
		*/

		xiaoqiang:for(int x = 0; x < 3; x++)
		{
			wangcai:for(int y = 0; y < 4; y++)
			{
				System.out.println("x="+x);
				continue xiaoqiang;
			}
		}
	}
}