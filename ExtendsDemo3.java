
//��Ա����
/*
���Ӹ����г��ֳ�Ա����һģһ�������������������ĺ�����
�������󣬳�Ϊ���ǲ��������Ǻ������Ӹ����е����ԡ�
�����������ԣ�
	1.���ء�ͬһ�����С�
	2.���ǡ������У�����Ҳ��Ϊ��д����дoverride

����ע�����
1.���෽�����Ǹ��෽��ʱ������Ȩ�ޱ�����ڵ��ڸ����Ȩ�ޡ�
2.��ֻ̬�ܸ��Ǿ�̬���򱻾�̬���ǡ�




*/
class Fu
{
	static void show()
	{
		System.out.println("fu show run");
	}
}

class Zi extends Fu
{
	static void show()
	{
		System.out.println("zi show run");
	}
}


class ExtendsDemo3 
{
	public static void main(String[] args) 
	{
		//Zi z = new Zi();
		//z.show();
		NewPhone p = new NewPhone();
		p.show();
	}
}


/*
ʲôʱ��ʹ�ø��ǲ�����

����һ��������������չʱ��������Ҫ��������Ĺ���������
����Ҫ���������иù��ܵ����������ǣ���ʹ�ø��ǲ�����ɡ�


*/
class Phone
{
	void call(){}
	void show()
	{
		System.out.println("number");
	}
}

class NewPhone extends Phone
{
	void show()
	{
		
		System.out.println("name");
		System.out.println("pic");
		super.show();

	}
}
