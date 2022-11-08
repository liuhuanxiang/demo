package structured.flyweight;

public class Test {
    
    public static void main(String[] args) {
        //String str1 = "efg";
        //String str2 = "abcd";
        //System.out.println("str1 = "+str2+str1);
        
        String str1 = "abcd";
        String str2 = "abcd";
        String str3 = "ab"+"cd";
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
    }
    
}
