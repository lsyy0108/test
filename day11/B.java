class B extends School
{
	private int eng;
	B(String name,int eng)
	{
		super(name);
		this.eng=eng;
	}

	void set(int eng)
	{
		setEng(eng);
	}

	void setEng(int eng)
	{
		this.eng=eng;
	}


	String show()
	{
		return super.show()+"\t英文:"+eng;
	}

	void skillA()
	{

	}

}