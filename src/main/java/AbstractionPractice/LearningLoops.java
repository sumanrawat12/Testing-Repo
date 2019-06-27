package AbstractionPractice;

import java.util.Scanner;

public class LearningLoops {

	public static void main(String args[])
	{
		int i,j,a,b,c;
		Scanner inputpar= new Scanner(System.in);
		/*
		 * i=inputpar.nextInt(); j=inputpar.nextInt();
		 */
		//a=inputpar.nextInt();
		b=inputpar.nextInt();
		
		c=inputpar.nextInt();
		
		for(i=0;i<=b;i++)
		{
			for(j=0;j<=c;j++)
			{
				a=i*j;
				System.out.println(i+"*" +j+"=" +a);
			}
		}
	}
}
