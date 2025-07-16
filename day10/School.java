/*final*/ class School
{
	private String name;

	final double pi=3.14;
	final double pi2=10.12;
	School(String name)
	{
		this.name=name;
		//this.pi=10.12;
	}

	final String show()
	{
		return "名:"+name;
	}


	void skill()
	{
		System.out.println("School skill");
	}

	void skillA()
	{
		
	}
}