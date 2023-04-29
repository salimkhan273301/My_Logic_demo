import java.util.Scanner;

public class CancatDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=0;
		String num2 ="";
		int sum=0;
		int a=0;
		int b=0;
				
		System.out.println("Please enter the size:");
		int Size=sc.nextInt();
		int[] arr=new int[Size];
		System.out.println("Please enter the number:");
		
		for(int i=0; i<Size; i++)
		{
		
			arr[i]=sc.nextInt();
		}
	 for(int i=0; i<arr.length; i++)
	 {
		 for(int j=0; j<arr.length; j++)
		 {
			 if(arr[j]==5)
			 {
				  a=j;
				 
			 }
			 else if(arr[j]==8) {
				 b=j;
			 }
			 
			 {
				 
			 }
		 }
	 }
	 System.out.println(" Position of 5 ="+a);
	 System.out.println("Position of 8 ="+b);
	 int i=0;
	 while(i<arr.length)
	 {
		 if(i<a || i>b)
		 {
			 num1=num1+arr[i]; 
		 }
		 else
		 {
			 String x=String.valueOf(arr[i]);
			 num2=num2+x; 
		 }
		 //System.out.println(arr[i]);
		 i++;
		
	 }
	 System.out.println("Sum of the digit="+num1);
	 System.out.println("Num2 Cancatination= "+num2);
	 Integer v=Integer.valueOf(num2);
	 System.out.println("sum of num1 and num2 is="+(num1+v));
	

	}

	
}
