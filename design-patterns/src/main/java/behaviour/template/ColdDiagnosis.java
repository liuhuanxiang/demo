package behaviour.template;

public class ColdDiagnosis extends AbstractDiagnosis{
    @Override
    public void prescribe() {
        System.out.println("3 >> 一眼丁真， 鉴定为假， 你这不是感冒， 存粹是想摆烂");
    }

    @Override
    public void medicine() {
        System.out.println("4 >> 开点头孢回去吃吧");
    }
}
