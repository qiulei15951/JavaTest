

class Fu
{
	Fu()
	{
		show();
	}

	void show()
	{
		System.out.println("haha");
	}
}


class Zi extends Fu
{
	int num = 9;
	Zi()
	{
		System.out.println("zi constructoc num"+num);
	}
	void show()
	{
		System.out.println("show ......."+num);
	}
}

class Test3 
{
	public static void main(String[] args) 
	{
		new Zi();
	}
}
