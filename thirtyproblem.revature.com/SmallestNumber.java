import java.util.Scanner;

public class SmallestNumber {
	private static int maxnumber(int[] arr) {
		
		int max=arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
           return max;
		}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the Size:");
		int s=sc.nextInt();
		int[] arr=new int[s];
		
		System.out.println("Please Enter the ["+(s)+"] element:");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		int min=arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
				
		System.out.println("Smallest number  is="+min);
		System.out.println("Max number is="+maxnumber(arr));
	}

	
	

}
