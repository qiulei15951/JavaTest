
/*
当成员变量和局部变量重名，可以用关键字this来区分。

this：代表对象，代表那个对象呢？当前对象。
	  this就是所在函数所属对象的引用。
	  简单说：哪个对象调用了this所在的函数，this就代表哪个对象。

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
	判读是否同龄人。
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
		//Person p = new Person("旺财");
		//p.speak();
		//Person p1 = new Person("小强");
			//p.speak();
	}
}
