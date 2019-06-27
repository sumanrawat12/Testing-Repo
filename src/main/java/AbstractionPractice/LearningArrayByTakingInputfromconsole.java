package AbstractionPractice;

import java.util.Scanner;
import java.util.ArrayList;
//Have doubt about unbalanced array for example 2 of 3 array
public class LearningArrayByTakingInputfromconsole {
public static void main(String args[])
{
	int len,bre;
	Scanner inputval=new Scanner(System.in);
	//ArrayList inputval1=new ArrayList();
	System.out.println("enter lengh");
	len=inputval.nextInt();
	System.out.println("enter bread");
	bre=inputval.nextInt();
	
	int a[][] = new int[len][bre];
	
	int i,j;
	for (i=0;i<a.length;i++)
	{
		for (j=0;j<a.length;j++)
		{
			System.out.println("inserting arrays");
			a[i][j]=inputval.nextInt();
			System.out.println(a[i][j]);	
								
		}
		System.out.println();
	}
	
}
}
