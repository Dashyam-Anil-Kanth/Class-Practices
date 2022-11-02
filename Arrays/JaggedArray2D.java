import java.util.Scanner;

public class JaggedArray2D {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int [][]ar=new int[2][];
		ar[0]=new int[2];
		ar[1]=new int[1];
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				System.out.println("enter the values for" + i + "and" + j );
				ar[i][j]=scn.nextInt();
			}
		}
		
		
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				System.out.println("values of "+ i + " and " + j+" is " + ar[i][j]);
			}
		}
	}
}
