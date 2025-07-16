class Ex5
{
	public static void main(String[] args) {
		/*int[] x=new int[3];
		int[] y=new int[3];*/

		/*int[][] x=new int[2][3];
		x[0][0]=100;*/

		int[][] x=new int[][]
		{
			{10,20,30},
			{40,50,60},
			{50,50,42}
		};

		System.out.println(x);
		System.out.println("\t"+x[0]);
		System.out.println("\t\t"+x[0][0]);
		System.out.println("\t"+x[1]);
		System.out.println("\t\t"+x[1][0]);

		System.out.println("========================");
		System.out.println(x.length);
		System.out.println(x[0].length);
		//System.out.println(x[0][0].length);
		System.out.println("========================");

		System.out.println(x);
		for(int i=0;i<x.length;i++)
		{
			System.out.println("\t"+x[i]);
			for(int j=0;j<x[i].length;j++)
			{
				System.out.println("\t\t"+x[i][j]);
			}
		}

		System.out.println("========================");
		System.out.println(x);
		for(int[] o:x)
		{
			System.out.println("\t"+o);
			for(int u:o)
			{
				System.out.println("\t\t"+u);
			}
		}
	}
}