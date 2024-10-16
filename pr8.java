import java.util.Scanner;
class Pr9{
	static void double_char(String str){
		String result = "";
		for(int i=0;i<str.length();i++){
			result=result+(str.charAt(i))+(str.charAt(i));
		}
		System.out.print(result);
	}
	public static void main(String[] args){
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Give String:");
		s=sc.nextLine();
		double_char(s);
	}
}
