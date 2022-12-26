package behavioral.i_state;

public class UnLoginState extends UserState {
	
	@Override
	void favorite() {
		this.switchToLogin();
		this.appContext.getCurrentState().favorite();
	}
	
	@Override
	void comment(String comment) {
		this.switchToLogin();
		this.appContext.getCurrentState().comment(comment);
	}
	
	private void switchToLogin() {
		System.out.println("条转到登陆页面");
		this.appContext.setCurrentStat(AppContext.LOGIN);
	}
}
