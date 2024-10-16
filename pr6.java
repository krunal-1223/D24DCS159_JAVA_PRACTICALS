import java.lang.*;
import java.util.*;
class Pr7{
	
	static void front_times(String s,int n){
		for(int i=0;i<n;i++){
			System.out.print(s);
		}
	}
	public static void main(String[] args){
		int n;
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Write the String :");
		str=sc.nextLine();
		str=str.substring(0,3);
		System.out.println("Give the copy number :");
		n=sc.nextInt();
		front_times(str,n);
	}
}
