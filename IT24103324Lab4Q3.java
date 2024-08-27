import java.util.Scanner;
	public class IT24103324Lab4Q3 {
		public static void main(String [] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the number:");
			int number=sc.nextInt();
			String result= (number>0)?"number is positive": (number<0)?"number is negative":"number is zero";
			System.out.println(result);
			
		}
	}