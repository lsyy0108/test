class Ordering
{
	int a;
	int b;
	int c;
	int sum;
Ordering(int a,int b,int c)
{
	this.a=a;
	this.b=b;
	this.c=c;
	if(a>=0&&b>=0&&c>=0)
		{
			sum=a*120+b*130+c*140;

			if(sum>=3000)
			{
				sum=(int)(sum*0.95);
			}
		}
		else
		{
			System.out.println("a,b,c數量需>=0\n");
		}
	}

	//methods
	void change1(int a,int b,int c)
	{
			this.a=a;
			this.b=b;
			this.c=c;

			sum=a*120+b*130+c*140;
	}
	int change2(int a,int b,int c)
	{
			this.a=a;
			this.b=b;
			this.c=c;

			sum=a*120+b*130+c*140;
			return sum;
	}

	void show()
	{
		System.out.println("A:"+a+
			"\tB:"+b+
			"\tC:"+c+
			"\t金額:"+sum+"元");
	}
}