package main.codeKata;

public class Kata3 {

	public String fail1 = "password should not be null";
	public String fail2 = "password should be larger than 8 chars";
	public String fail3 = "password should have one uppercase letter at least";
	public String fail4 = "password should have one lowercase letter at least";
	public String fail5 = "password should have one number at least";

	public boolean verify(String pw) {
		if (pw == null) {
			throw new IllegalArgumentException(fail1);
		}
		if (pw.length() < 8) {
			throw new IllegalArgumentException(fail2);
		}
		if (pw.matches("[^(?=.*[A-Z]).+$]")) {
			throw new IllegalArgumentException(fail3);
		}
		if (pw.matches("[^(?=.*[a-z]).+$]")) {
			throw new IllegalArgumentException(fail4);
		}
		if (pw.matches("[^(?=.*[0-9]).+$]")) {
			throw new IllegalArgumentException(fail5);
		}
		return true;
	}

}
