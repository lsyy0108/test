class B extends School
{
	private int eng;
	B(String name,int eng)
	{
		super(name);
		this.eng=eng;
	}

	String show2()
	{
		return super.show()+"\t英文:"+eng;
	}
}