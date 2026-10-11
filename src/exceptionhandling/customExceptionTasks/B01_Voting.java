package exceptionhandling.customExceptionTasks;

public class B01_Voting {
	String name;
	int age;

	public B01_Voting(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void isEligibleToVote() throws B02_InvalidAgeException {
		if (age >= 18) {
			System.out.println(name + " is eligible for voting");
		} else {
			throw new B02_InvalidAgeException();
		}
	}
}
