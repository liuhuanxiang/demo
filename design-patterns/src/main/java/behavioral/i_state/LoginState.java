package behavioral.i_state;

public class LoginState extends UserState{
	
	@Override
	void favorite() {
		System.out.println("ζΆθζε");
	}
	
	@Override
	void comment(String comment) {
		System.out.println(comment);
	}
}
