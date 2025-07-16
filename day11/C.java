class C extends School
{
	private int math;
	C(String name,int math)
	{
		super(name);
		this.math=math;
	}

	void set(int math)
	{
		setMath(math);
	}

	void setMath(int math)
	{
		this.math=math;
	}

	String show()
	{
		return super.show()+"\t數學:"+math;
	}

	void skillA()
	{

	}
}