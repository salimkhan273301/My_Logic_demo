import java.util.Scanner;

public class FrequencyofString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String string;
		int i=0,j=0;
		int[] arr=new int[256];
		System.out.println("please Enter the String:");
		string=sc.nextLine();
		while(i<string.length())
		{
		int x=	arr[string.charAt(i)]++;
			System.out.println(x);
			i++;
		}
//		for(int y:arr)
//		{
//			System.out.println(y);
//		}
		while(j<arr.length)
		{
			if(arr[j]!=0)
			{
			System.out.format("\n'%c' Charactor Occurance %d Times",j,arr[j]);	
			}
			j++;
		}
		

	}

}
