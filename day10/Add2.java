class Add2
{
	public static void main(String[] args) {
		School[][] s=new School[3][];
		s[0]=new School[4];
		s[1]=new School[3];
		s[2]=new School[5];
		//is-a School


		s[0][0]=new A("a1",85);
		s[0][1]=new A("a2",85);
		s[0][2]=new A("a3",85);
		s[0][3]=new A("a4",85);


		s[1][0]=new B("b1",70);
		s[1][1]=new B("b2",70);
		s[1][2]=new B("b3",70);
		

		s[2][0]=new C("c1",60);
		s[2][1]=new C("c2",60);
		s[2][2]=new C("c3",60);
		s[2][3]=new C("c4",60);
		s[2][4]=new C("c5",60);


		System.out.println(s);
		for(int i=0;i<s.length;i++)
		{
			System.out.println("\t"+s[i]);
			for(int j=0;j<s[i].length;j++)
			{
				System.out.println("\t\t"+s[i][j]+"\t"+s[i][j].show());
			}
		}

		System.out.println("=========================");
		System.out.println(s);
		for(School[] o:s)
		{
			System.out.println("\t"+o);
			for(School u:o)
			{
				System.out.println("\t\t"+u+"\t"+u.show());
			}
		}
		System.out.println("=========================");

		((A)s[0][0]).skillA();

		System.out.println(s[0][0] instanceof School);
		System.out.println(s[0][0] instanceof A);
		System.out.println(s[0][0] instanceof B);
		System.out.println("=========================");
		//s[0][0]=s[1][0];

		System.out.println(s[0][0].show());
		System.out.println(s[1][0].show());
		System.out.println(s[0][0]+"\t"+s[1][0]);
		System.out.println(s[0][0].equals(s[1][0]));

		System.out.println(s[2][0].getClass().getName());

		System.out.println(s[2][0].toString());
		System.out.println(s[2][0]);

		Double x=10.12;

		System.out.println(x.toString()+100);
		System.out.println("=========================");
		//((A)s[0][0]).skillA();
		s[0][0].skillA();
		s[0][1].skillA();
		s[0][2].skillA();



	}
}