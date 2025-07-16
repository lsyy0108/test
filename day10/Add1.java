class Add1
{
	public static void main(String[] args) {
		A a1=new A("a1",100);//is-a A , is-a School-->檢查方法名稱
		System.out.println(a1.show());//繼承
		System.out.println(a1);		
		a1.skill();//override


		a1.skillA();//A有,school沒有



		System.out.println("========異質宣告=============");
		School a2=new A("a2",80);//is-a School-->檢查方法名稱-->方法限定1- 繼承,2-override
		System.out.println(a2.show());//繼承
		System.out.println(a2);
		a2.skill();//override

		((A)a2).skillA();//casting轉型



	}
}