package behavioral.i_state;

public class LoginState extends UserState{
	
	@Override
	void favorite() {
		System.out.println("收藏成功");
	}
	
	@Override
	void comment(String comment) {
		System.out.println(comment);
	}
}
