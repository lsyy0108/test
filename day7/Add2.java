class Add2
{
	public static void main(String[] args) {
		
		Member [][] m=new Member[2][3];
		m[0][0]=new Member("a1","taipei");
		m[0][1]=new Member("a2","taipei");
		m[0][2]=new Member("a3","taipei");

		m[1][0]=new Member("b1","台北");
		m[1][1]=new Member("b2","台北");
		m[1][2]=new Member("b3","台北");


		System.out.println(m);
		System.out.println("\t"+m[0]);
		System.out.println("\t"+m[0][0]);
		
		System.out.println(m[0][0]+"\t"+m[0][0].show());
		System.out.println(m[0][1]+"\t"+m[0][1].show());
		System.out.println(m[0][2]+"\t"+m[0][2].show());
		System.out.println(m[1][0]+"\t"+m[1][0].show());
		System.out.println(m[1][1]+"\t"+m[1][1].show());
		System.out.println(m[1][2]+"\t"+m[1][2].show());
	
		System.out.println("=================");
		System.out.println(m);

		for (int i=0;i<m.length;i++)
		{
			System.out.println("\t"+m[i]);
			for(int j=0;j<m[i].length;j++)
			{
				System.out.println("\t\t"+m[i][j]+"\t"+m[i][j].show());
			}
		}
		System.out.println("=================");
		System.out.println(m);
		for(Member[] o:m)
		{
			System.out.println("\t"+o);
			for(Member u:o)
			{
				System.out.println("\t\t"+u+"\t"+u.show());
			}

		}
}
}