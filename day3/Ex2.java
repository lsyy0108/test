class Ex2
{
	public static void main(String[] args) {
		double d1=10.12;
		double d2=10.12;

		System.out.println("d1="+d1);
		System.out.println("d2="+d2);

		System.out.println(d1==d2);

		System.out.println("======================");


		Double D1=10.12;
		Double D2=10.12;

		System.out.println("D1="+D1);
		System.out.println("D2="+D2);

		System.out.println(D1==D2);
		System.out.println(D1.equals(D2));

		String c1="5.6";
		String c2="1.2";
		Double C1=new Double(c1);
		Double C2=new Double(c2);
		System.out.println(C1+C2);

	}
}