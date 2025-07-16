class Add1
{
	public static void main(String[] args) {
		/*Member [] m=new Member[3];
		m[0]=new Member("a1","taipei");
		m[1]=new Member("a2","taipei");
		m[2]=new Member("a3","taipei");*/

		Member [] m=new Member[]
		{
			new Member("a1","taipei"),
			new Member("a2","taipei"),
			new Member("a3","taipei")
		};

		System.out.println(m);
		System.out.println(m[0]+"\t"+m[0].show());
		System.out.println(m[1]+"\t"+m[1].show());
		System.out.println(m[2]+"\t"+m[2].show());

		System.out.println("=================");
		System.out.println(m);

		for (int i=0;i<m.length;i++)
		{
			System.out.println("\t"+m[i]+"\t"+m[i].show());
		}
		System.out.println("=================");
		System.out.println(m);
		for(Member o:m)
		{
			System.out.println("\t"+o+"\t"+o.show());
		}


		/*Member m=new Member("a","台北");

		System.out.println(m.show());*/
	}
}