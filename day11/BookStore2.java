class BookStore2 implements Book
{
	public double bookPrice(double price)
	{
		if(price>=3000)
		{
			price=price*0.95;
		}
		return price;
	}

	public String bookName(String name)
	{
		return "java書名="+name;
	}
}