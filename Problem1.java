import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		int no1,no2,ans = 0;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("1.Addtion\n2.Substraction\n3.Multiplication\n4.Division");
			System.out.println("Enter your choice :");
			int ch=sc.nextInt();
			System.out.println("Enter Two Numbers : ");
			no1=sc.nextInt();
			no2=sc.nextInt();
			switch(ch) {
			case 1:
				ans=no1+no2;
				break;
			case 2:
				ans=no1-no2;
				break;
			case 3:
				ans=no1*no2;
				break;
			case 4:
				ans=no1/no2;
				break;
			}
			System.out.println("Answer is : "+ans);
			System.out.println("To continue..type yes");
		}while(sc.next().equals("yes"));

	}

}
