class Order
{
	//field
	String name;
	int ruler;
	int pen;

	//constructors


	Order(int ruler)
	{
		this.ruler=ruler;
		//ruler=10;
		System.out.println("新訂單");
	}
	Order(String name,int ruler,int pen)
	{
		this.name=name;
		this.ruler=ruler;
		this.pen=pen;
	}
	Order(int ruler,int pen)
	{
		this.ruler=ruler;
		this.pen=pen;
	}


	//methods

	void show()
	{
		System.out.println("名:"+name+"\t尺:"+ruler+"\t筆:"+pen);
	}
}