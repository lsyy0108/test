class Ex3
{
	public static void main(String[] args) {
		//int[] x=new int[7];
		int[] x=new int[]{20,33,47,68};
		//double[] x=new double[3];
		//boolean[] x=new boolean[3];
		//String[] x=new String[3];
		//Integer[] x=new Integer[3];
		//Boolean[] x=new Boolean[3];
		System.out.println("個數:"+x.length);
		System.out.println(x);
		for(int i=0;i<x.length;i++)//找名字
		{
			System.out.println(x[i]);
		}

		System.out.println("=====================");
		System.out.println(x);
		for(int o:x)//copy
		//for(double o:x)
		//for(boolean o:x)//java 5.0-->Boolean to boolean-->unBoxing
		//for(Boolean o:x)
		{
			System.out.println(o);
		}
	}
}