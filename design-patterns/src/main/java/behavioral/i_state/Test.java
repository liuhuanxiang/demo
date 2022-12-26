package behavioral.i_state;

public class Test {
	
	public static void main(String[] args) {
		AppContext appContext = new AppContext();
		appContext.setCurrentStat(AppContext.LOGIN);
		appContext.comment("修改成功");
	}
	
}
