class Student
{
	//field-->欄位-->column
	String name;
	int chi;
	double eng;
	boolean x;
	

	//constructors
	Student()
	{
		chi=60;
		System.out.println("新增一位學生");
}


	//methods
		void show()
		{
			System.out.print("名:"+name+"\t國文"+chi+"\t英文"+eng+"\tx:"+x);
		}

}
