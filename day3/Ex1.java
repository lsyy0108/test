import java.util.Scanner;
import java.util.Date;

class Ex1
{
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("請輸入文字");
		String name=sc.next();
		System.out.println("name="+name);

		Date d=new Date();
		System.out.println("日期="+d);

	}
}