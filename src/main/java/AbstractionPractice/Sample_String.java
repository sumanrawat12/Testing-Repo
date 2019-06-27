package AbstractionPractice;

public class Sample_String {
	public static void main(String[] args){
		char[] printingchar = {'S','H','R','E','E'};
		
		System.out.println(printingchar);

		//String Concatenation
		String str1 = "Rock";
		String str2 = "Star";
		String str5 = "Hi I am Suman Rawat Shree";
		//Method 1 : Using concat
		String str3 = str1.concat(str2);
		System.out.println(str3);
		//Method 2 : Using "+" operator
		String str4 = str1 + str2;
		System.out.println(str4); 
		System.out.println("Character at position 2 : " + str1.charAt(2));
		System.out.println("Comaprison "+str1.compareTo("Rock"));
		System.out.println("Comaprison OF upper case"+str1.compareToIgnoreCase("ROCK"));
		System.out.println("Replace"+str1.replace("Rock", "newChar"));
		System.out.println(str1.length());
		System.out.println(str5.indexOf('k'));
		System.out.println(str1.indexOf(2));
		System.out.println(str5.indexOf("Shree"));
		System.out.println(str5.charAt(14));
		}
}
