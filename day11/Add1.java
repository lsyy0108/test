class Add1
{
	public static void main(String[] args) {
		/*School s=new A("abc",75);
		System.out.println(s.show());*/

		School[] s=new School[]
		{
			new A("a1",74),
			new B("b1",80),
			new C("c1",65)
		};



		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]+"\t"+s[i].show());
			//s[i].skillA();
		}

		System.out.println("====================");
		s[1].set(100);
		
		for(School o:s)
		{
			System.out.println(o+"\t"+o.show());
		}
		//System.out.println("====================");

		//((A)s[0]).skillA();

		//System.out.println("====================");

		//School s2=new School("aaaa");
	}
}