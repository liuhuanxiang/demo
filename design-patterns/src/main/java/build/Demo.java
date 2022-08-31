package build;

import cn.hutool.json.JSONUtil;

public class Demo {

    public static void main(String[] args) {
        Student builder = Student.builder()
                .id(1)
                .age(2)
                .builder();

        System.out.println((JSONUtil.toJsonStr(builder)));
    }
}
