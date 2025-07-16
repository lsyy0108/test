/*
Compiler
a->call by reference-->文件class-->is-a 
b->call by value-->class提共功能-->has-a

*/
class Ex1
{
	public static void main(String[] args) {
		A a1=new A();
		/*
		A is-a A
		A is-a school

		A has-a excel
		A has-a show()
		A has-a name
		A has-a chi
		*/


		B b1=new B();
		/*
		B is-a B
		B is-a school

		B has-a word
		B has-a show()

		B has-a name
		B has-a chi


		*/

		a1.show();
		b1.show();
	}
}