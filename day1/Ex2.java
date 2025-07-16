class Ex2
{
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);

		System.out.println("輸入次數");
		int n=sc.nextInt();

		for(int i=1;i<=n;i++)
		{
			/*if(i==101)break;*/
			if(i>12 && i<90) continue;
			if(i>130)break;
			if(i>120)return;
			System.out.println("i="+i+"\thello java 巨匠電腦");
		}
	}
}