class Student
{
	//field
	String name;
	private int chi;
	private int eng;
	private int math;
	private int sum;
	private double ave;

	//constructors

	Student(String name,int chi,int eng,int math)
	{
		if(chi>=0&&chi<=100&&eng>=0&&eng<=100&&math>=0&&math<=100)
		{
			this.name=name;
			this.chi=chi;
			this.eng=eng;
			this.math=math;

			sum=chi+eng+math;

			ave=sum/3.;
		}
		else
		{
			System.out.println("分數需介於0~100");
		}
	}

	//methods
	void setName(String name)
	{
		this.name=name;
	}

	String getName()
	{
		return this.name;
	}


	void change1(int chi,int eng,int math)
	{
			this.name=name;
			this.chi=chi;
			this.eng=eng;
			this.math=math;
			sum=chi+eng+math;

			ave=sum/3.;
	}

	double change2(int chi,int eng,int math)
	{
			this.name=name;
			this.chi=chi;
			this.eng=eng;
			this.math=math;
			sum=chi+eng+math;

			ave=sum/3.;
			return ave;
	}

	void show()
	{
		System.out.println("名:"+name+
			"\t國文:"+chi+
			"\t英文:"+eng+
			"\t數學:"+math+
			"\t總分:"+sum+
			"\t平均:"+ave);
	}
}