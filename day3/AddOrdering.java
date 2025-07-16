class AddOrdering
{
	public static void main(String[] args) {
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("輸入A:");
		int a=sc.nextInt();
		System.out.println("輸入B:");
		int b=sc.nextInt();
		System.out.println("輸入C:");
		int c=sc.nextInt();


		Ordering o=new Ordering(a,b,c);
		o.show();
	}
}