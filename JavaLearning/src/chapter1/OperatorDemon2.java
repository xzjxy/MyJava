package chapter1;

public class OperatorDemon2 {
    // ++ , -- 运算
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        ++a;
        System.out.println(a);
        a++;
        System.out.println(a);
        int c = b++;
        System.out.println(c);
        c = ++b;
        System.out.println(c);
    }
}
