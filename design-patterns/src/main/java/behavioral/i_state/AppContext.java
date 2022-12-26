package behavioral.i_state;

public class AppContext {
	
	public static final UserState LOGIN = new LoginState();
	public static final UserState UN_LOGIN = new UnLoginState();
	private UserState currentState = UN_LOGIN;
	
	{
		LOGIN.setContext(this);
		UN_LOGIN.setContext(this);
	}
	
	public UserState getCurrentState() {
		return this.currentState;
	}
	
	public void setCurrentStat(UserState userState) {
		this.currentState = userState;
	}
	
	public void favorite() {
		this.currentState.favorite();
	}
	
	public void comment(String comment) {
		this.currentState.comment(comment);
	}

}
