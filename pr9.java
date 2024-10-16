import java.util.Scanner;
class Pr10{
	public static void main(String[] args){
		System.out.println("Enter a String :");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("The Length of String is :"+str.length());
		System.out.println("The String in UpperCase :" + str.toUpperCase() );
		System.out.println("The String in LowerCase :" + str.toLowerCase() );
		System.out.print("The Reverse String :");
		for(int i=(str.length()-1);i>=0;i--){
			char c;
			c=str.charAt(i);
			System.out.print(c);
		}
	}
}
