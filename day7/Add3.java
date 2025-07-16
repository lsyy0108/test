class Add3{
	public static void main(String[] args) {
		Member[][][]m=new Member[2][][];
		m[0]=new Member[3][];
		m[0][0]=new Member[2];
		m[0][1]=new Member[2];
		m[0][2]=new Member[3];

		m[1]=new Member[2][];
		m[1][0]=new Member[3];
		m[1][1]=new Member[2];

		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m[i].length;j++)
			{
				for(int k=0;k<m[i][j].length;k++)
				{

					System.out.println("\t\t\t"+m[i][j][k]);
				}
			}
		}
		System.out.println("=======================");
		for(Member[][] o:m)
		{
			System.out.println("\t"+o);
			for(Member[]u:o)
			{
				System.out.println("\t\t"+u);
				for(Member v:u)
				{
					System.out.println("\t\t\t"+v);
				}
			}
		}

	}
}