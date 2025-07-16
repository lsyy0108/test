class Company
{
	private String name;
	private String address;
	
	//Company(){}

	Company(String name)
	{
		

		this.name=name;
		//System.out.println("new Company員工 名="+name+"\t地址:"+address);
	}

	Company(String name,String address)
	{
		this.name=name;
		this.address=address;
		//System.out.println("new Company員工 名="+name+"\t地址:"+address);
	}


	protected void skill()
	{
		System.out.println("new Company skill");
	}




	void change(String name,String address)
	{
		this.name=name;
		this.address=address;
	}

	void change(String name)
	{
		this.name=name;
	}



	String show()
	{
		return "名:"+name+"\t地址:"+address;
	}
}