package com.sb;

import com.sa.Student;
import com.sa.Student2;
public class A extends Student implements Student2//class A extends com.sa.Student implements com.sa.Student2
{
	private int chi;
	public A(String name,int chi)
	{
		super(name);
		this.chi=chi;
	}

	public void skill()
	{
		System.out.println("A skill");
	}

	public String show()
	{
		return super.show()+"\t國文:"+chi;
	}
}