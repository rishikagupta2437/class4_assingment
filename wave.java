
public class wave {
	void swap(int num[],int a, int b)
	{
		int temp=num[a];
		num[a]=num[b];
		num[b]=temp;
	}
	void sort(int num[],int n)
	{
		for(int i=0;i<n;i=i+2)
		{
			if(i>0 && num[i-1] > num[i])
				swap(num,i-1,i);
			if(i<n-1 && num[i]<num[i+1])
				swap(num,i,i+1);
		}
	}
	public static void main(String[] args)
	{
		wave x=new wave();
		int num[]={4,3,2,1,6,5,7,8,9};
		int  y=num.length;
		x.sort(num, y);
		for(int i: num)
		{
			System.out.print(i+" ");
		}
	}

}
