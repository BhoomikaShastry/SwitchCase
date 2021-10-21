import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		do {
			System.out.println("Want to implement? (enter y to proceed)");
			String input=s.next();
			System.out.println("Enter the case to be implemented");
				int c=s.nextInt();
				switch(c)
				{
				case 1: System.out.println("Enter 1st number");
				int a=s.nextInt();
				System.out.println("Enter 2nd number");
				int b=s.nextInt();
				System.out.println("Sum of "+a+" & "+b+": "+(a+b));
				break;
				case 2: System.out.println("Enter 1st number");
				int p=s.nextInt();
				System.out.println("Enter 2nd number");
				int q=s.nextInt();
				float avg=(p+q)/2;
				System.out.println("Average: "+avg);
				break;
				case 3: System.out.println("Enter a number");
				int n=s.nextInt();
				if(n%2==0)
				{
					System.out.println(n+" is even");
				}
				else
					System.out.println(n+" is odd");
				break;
				case 4: System.out.println("Enter a number");
				int m=s.nextInt();
				if(m>0)
					System.out.println(m+" is positive");
				else
					System.out.println(m+" is negative");
				break;
				case 5: System.out.println("Enter a number");
				int x=s.nextInt();
				boolean flag = false;
			    for (int i = 2; i <= x / 2; ++i) {
			      
			      if (x % i == 0) {
			        flag = true;
			        break;
			      }
			    }

			    if (!flag)
			      System.out.println(x+ " is a prime number.");
			    else
			      System.out.println(x+ " is not a prime number.");
			    break;
				case 6: System.exit(0);
				default: System.out.println("Enter the case between 1 to 6");
				break;
				}
			}while(true);
			
			}
}
			
			
		




