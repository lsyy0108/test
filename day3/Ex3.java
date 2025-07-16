class Ex3
{
	public static void main(String[] args) {
		Ordering o1=new Ordering(1,2,3);
		Ordering o2=new Ordering(3,2,3);
		
		o1.show();
		o2.show();
		//o1.change1(4,2,4);
		System.out.print("金額="+(o1.change2(3,3,3)+o2.change2(4,4,4)));
		o1.show();
		o2.show();
	}
}