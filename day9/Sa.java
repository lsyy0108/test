class Sa extends Company
{
	private int lcd;

	Sa(String name,int lcd)
	{
			
			//super(name,"taipei");//執行步驟 
			super(name);
			this.lcd=lcd;
			//this.name="aaaa";
			//System.out.println("Sa部門,lcd="+lcd+"\tname"+this.name);
			//System.out.println("Sa部門,lcd="+lcd);


	}

	Sa(String name,String address,int lcd)
	{
		super(name,address);
		this.lcd=lcd;
		//System.out.println("Sa部門,lcd="+lcd);
	}

	void change(int lcd)
	{
		this.lcd=lcd;
	}


	public void skill()
	{
		System.out.println("new Sa skill");

		//return "new Sa skill";
	}


	private void skillSa()
	{
		System.out.println("new Sa skill");
	}


	String show()
	{
		return super.show()+"\tlcd:"+this.lcd;
	}
}