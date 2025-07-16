class Add1
{
	public static void main(String[] args) {
		Student s=new Student("abc",75,84,65);
		s.show();
		System.out.println(s.change2(50,75,65)*10);
		s.setName("tecaher");
		s.show();
		//s.chi=-9;
		s.show();

		System.out.println(s.getName());


	}
}