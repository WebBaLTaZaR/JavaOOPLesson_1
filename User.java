package JavaOOPLesson_1;

public class User {
	private String login;
	private String password;

	public User(String login, String password) {
		this.login = login;
		this.password = password;
	}

	public String GetLogin() {
		return login;
	}

	public String GetPassword() {
		return password;
	}

	public void SetLogin(String login) {
		if (login.length() < 4) {
			throw new IllegalArgumentException();
		} else {
			this.login = login;
		}

	}

	public void SetPassword(String password) {
		if (password.length() < 8 || password.length() > 8) {
			throw new IllegalArgumentException();
		} else {
			this.password = password;
		}

	}
}
