package behavioral.i_state;

public abstract class UserState {
	
	protected AppContext appContext;
	
	public void setContext(AppContext appContext) {
		this.appContext = appContext;
	}
	
	abstract void favorite();
	
	abstract void comment(String comment);
	
}
