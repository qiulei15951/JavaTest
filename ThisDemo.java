
/*
����Ա�����;ֲ����������������ùؼ���this�����֡�

this��������󣬴����Ǹ������أ���ǰ����
	  this�������ں���������������á�
	  ��˵���ĸ����������this���ڵĺ�����this�ʹ����ĸ�����

*/

class Person
{
	private String name;
	private int age;

	Person()
	{
		name = "baby";
		age = 1;
		System.out.println("person run");
	}

	Person(String name)
	{
		this.name = name;
	}

	public void setName(String n)
	{
		name = n;
	}

	Person(String n,int a)
	{
		name = n;
		age = a;
	}

	public void speak()
	{
		System.out.println(name+":"+age);
	}

	/*
	�ж��Ƿ�ͬ���ˡ�
	*/
	public boolean compare(Person p)
	{
		/*
		if (this.age == p.age)
		{
			return true;
		}else
		{
			return false;
		}
		*/
		return this.age == p.age;
	}


}


class ThisDemo 
{
	public static void main(String[] args) 
	{

		Person p1 = new Person("aa",30);
		Person p2 = new Person("zz",12);

		p1.compare(p2);
		//Person p = new Person("����");
		//p.speak();
		//Person p1 = new Person("Сǿ");
			//p.speak();
	}
}
