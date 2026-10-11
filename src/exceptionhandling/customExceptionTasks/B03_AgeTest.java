package exceptionhandling.customExceptionTasks;
import java.util.Scanner;

public class B03_AgeTest {
	public static void main(String[] args) {
		Scanner sc = null;

		try {
			sc = new Scanner(System.in);
			System.out.println("Enter Name");
			String n = sc.nextLine();
			System.out.println("Enter Age");
			int a = sc.nextInt();
			B01_Voting v1 = new B01_Voting(n, a);
			v1.isEligibleToVote();
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
	}
}
