package exceptionhandling.customExceptionTasks;

import java.util.Scanner;

public class A03_MarksTest {
	public static void main(String[] args) {
		Scanner sc = null;

		try {
			sc = new Scanner(System.in);

			System.out.println("Enter Physics Marks:");
			int physics = sc.nextInt();

			System.out.println("Enter Chemistry Marks:");
			int chemistry = sc.nextInt();

			System.out.println("Enter Math Marks:");
			int math = sc.nextInt();

			System.out.println("Enter Biology Marks:");
			int biology = sc.nextInt();

			System.out.println("Enter Optional Subject Marks:");
			int optional = sc.nextInt();

			A01_Marks m = new A01_Marks(physics, chemistry, math, biology,
					optional);

			m.percentage();
		} catch (A02_InvalidMarksException e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
	}
}