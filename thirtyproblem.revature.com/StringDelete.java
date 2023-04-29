import java.util.Scanner;

public class StringDelete {
	private static void delete(String s) {
		StringBuffer sb1=new StringBuffer(s);
		sb1.deleteCharAt(1);
		sb1.deleteCharAt(3);
		System.out.println("After deleting the specifed indexed char="+sb1);
		
	}

	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the String :");
		String s=sc.nextLine();
		delete(s);
		StringBuilder sb=new StringBuilder(s);
		sb.deleteCharAt(0);
		System.out.println("\n The Final String after Deleting First Char="+sb);
		sb.deleteCharAt(sb.length()-1);
		System.out.println("\n The Final String after Deleting First & Last Char= "+sb);
		

	}

	
}
