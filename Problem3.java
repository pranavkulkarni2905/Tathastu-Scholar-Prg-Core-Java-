import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		int n,ans=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no for factorial :");
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			ans=ans*i;
		}
		System.out.println("factroial of number is : "+ans);
	}

}
