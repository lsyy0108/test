class A extends School
{
	private int chi;

	A(String name,int chi)
	{
		super(name);
		this.chi=chi;
	}

	void skillA()
	{
		System.out.println("A skillA");
	}

	void skill()
	{
		System.out.println("A skill");
	}

	String show2()
	{
		return super.show()+"\t國文:"+chi;
	}
}