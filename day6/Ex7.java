class Ex7
{
	public static void main(String[] args) {
		
		int[][] x=new int[2][];
		x[0]=new int[3];
		x[1]=new int[4];

		System.out.println(x);
		for(int i=0;i<x.length;i++)
		{
			System.out.println("\t"+x[i]);
			for(int j=0;j<x[i].length;j++)
			{
				System.out.println("\t"+x[i][j]);
			/*for(int k=0;k<x[i][j].length;k++)
				{
				System.out.println("\t\t"+x[i][j][k]);*/

			}
		}
		System.out.println("====================");
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
	
