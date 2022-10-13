package behaviour.chain.september26;


import java.util.ArrayList;
import java.util.List;

public class Test {
    
    public static void main(String[] args) {
        //
        //        Handler firstHandler = new FirstHandler();
        //        firstHandler.doHandler();
        List<String> a = new ArrayList<>();
        List<String> b = new ArrayList<>();
        a.add("a");
        a.add("aa");
        a.add("aaa");
        
        b.add("b");
        b.add("bb");
        b.add("bbb");
        for (String s : a) {
            //            System.out.println(s);
            for (String s1 : b) {
                System.out.println(s1);
                if (s1.equals("bb")) {
                    break;
                }
            }
            System.out.println(s);
            
        }
        
    }
}
