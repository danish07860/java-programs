package conn;

public class OABS {

	public static void main(String[] args) {
		//int[] a= {1,2,3,4,5};
		int[] a= {5,4,3,2,1};
		int ans=oredrAgnosticBS(a, 2);
		System.out.println(ans);

	}
	static int oredrAgnosticBS(int[] a,int target)
	{
		int start=0,end=a.length-1;
		boolean isAsc;
		if(a[start]<a[end])
		{
			isAsc=true;
		}
		else
		{
			isAsc=false;
		}
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(a[mid]==target)
			{
				return mid;
			}
			if(isAsc)
			{
				if(target<a[mid])
				{
					end=mid-1;
				}
				else
				{
					start=mid+1;
				}
			}
			else
			{
				if(target>a[mid])
				{
					end=mid-1;
				}
				else
				{
					start=mid+1;
				}
			}
			
			
		}
		return -1;
	}
	}


