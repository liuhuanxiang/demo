package behavioral.template_method;

public class ColdDiagnosis extends AbstractDiagnosis{
	
	@Override
	public void prescribe() {
		System.out.println("3 >> 感冒");
	}
	
	@Override
	public void medicine() {
		System.out.println("4 >> 买点头孢回去吧");
	}
}
