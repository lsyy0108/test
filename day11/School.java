abstract class School
{
	private String name;
	School(String name)
	{
		this.name=name;
	}
	String show()
	{
		return "名:"+name;
	}
	abstract void skillA();//只保留名稱
	abstract void set(int x);
	

}