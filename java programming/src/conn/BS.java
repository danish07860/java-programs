package conn;

public class BS {
	public static void main(String[] args) {
		int[] a= {1,4,7,8,15};
		int ans=bSearch(a,1);
		System.out.println(ans);
		
	}
	static int bSearch(int[] a,int target)
	{
		int start=0,end=a.length-1;
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(target<a[mid])
			{
				end=mid-1;
			}
			else if(target>a[mid])
			{
				start=mid+1;
			}
			else
			{
				return mid;
			}
		}
		return -1;
	}

}
