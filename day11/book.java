/*
field , abstract method


*/
//abstract class Book
interface Book
{
	//field
	public static final double pi=3.14;
	double pi2=3.12;
	

	//constructors
	//Book(int x){}


	//methods
	public abstract String bookName(String name);
	double bookPrice(double price);

	//java8 以後
	 default void show1()//物件類
	{
		System.out.println("Book test default");
	}

	 static void show2()
	 {
	 	System.out.println("Book test static");
	 }
}