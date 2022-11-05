public class Sorting{
	public static void main(String[]args) {
		int []ar= {4,3,2,1};
		
	
	
		for(int j=0;j<ar.length;j++)
		{
			for(int i=1;i<ar.length-j;i++)
			{
				if(ar[i]>ar[i-1])
				{
					int a=ar[i-1];
					ar[i-1]=ar[i];
					ar[i]=a;
				}				
			}
		}
		for(int b:ar)
		{
			System.out.println(b);
		}
	}
}