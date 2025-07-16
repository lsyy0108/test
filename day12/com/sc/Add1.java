package com.sc;
import com.sa.Student;
import com.sa.Student2;
import com.sb.A;
import com.sb.B;
class Add1//com.sc.Add1
{
	public static void main(String[] args) {
		//System.out.println("Hello java");

		Student s=new Student("abc");

		System.out.println(s.show());

		Student2 s2;
		A a=new A("a",10);
		a.skill();

		System.out.println(a.show());


		B b=new B("bb",45);
		b.skill();
		System.out.println(b.show());

	}
}