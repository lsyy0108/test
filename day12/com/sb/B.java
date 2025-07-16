package com.sb;
import com.sa.Student;
import com.sa.Student2;
public class B extends Student implements Student2
{
	private int eng;

	public B(String name,int eng)
	{
		super(name);
		this.eng=eng;
	}


	public void skill()
	{
		System.out.println("B skill");
	}

	public String show()
	{
		return super.show()+"\t英文:"+eng;
	}
}