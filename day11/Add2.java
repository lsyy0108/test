class Add2
{
	public static void main(String[] args) {
		//Book b1=new Book();
		System.out.println(Book.pi);
		System.out.println(Book.pi2);
		//Book.pi2=10.12;

		//BookStore1 b1=new BookStore1();

		Book[] b=new Book[]
		{
			new Bookstore1(),
			new BookStore2()
		};

		System.out.println("書名:"+b[0].bookName("java11")+"\t價格:"+b[0].bookPrice(4000));
		System.out.println("書名:"+b[1].bookName("java11")+"\t價格:"+b[1].bookPrice(4000));

		b[0].show1();
		b[1].show1();


	}
}