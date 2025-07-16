class A extends School
{
	private int chi;
	A(String name,int chi)
	{
		super(name);
		this.chi=chi;
	}


	String show()
	{
		return super.show()+"\t國文:"+chi;
	}

	void setChi(int chi)
	{
		this.chi=chi;
	}

	void set(int chi)
	{
		setChi(chi);
	}

	void skillA()
	{
		System.out.println("A skill chi="+this.chi);
	}
}