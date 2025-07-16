class C extends School
{
	private int math;
	C(String name,int math)
	{
		super(name);
		this.math=math;
	}

	String show2()
	{
		return super.show()+"\t數學:"+math;
	}

	public String toString()
	{
		return "位址:"+super.toString();
	}
}