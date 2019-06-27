package AbstractionPractice;

public class StrConvertfromInttoString {
	public static void main(String []args){
	    String strTest = "100";
	    //Convert the String to Integer using Integer.valueOf
	    int iTest = Integer.valueOf(strTest);
	    System.out.println("Actual String:"+ strTest);
	    System.out.println("Converted to Int:" + iTest);
	    //This will now show some arithmetic operation
	    System.out.println("Arithmetic Operation on Int:" + (iTest/4));
	  }
}
