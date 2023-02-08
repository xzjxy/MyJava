package chapter1;

public class OperatorDemon {
    // 目标： 掌握基本算数运输 + - * / %
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b); // 返回整数 0
        System.out.println(a *1.0 / b); // 转换float 0.333333
        System.out.println(a / b * 1.0); // 运算顺序问题 0，0
        System.out.println(a % b);
    }
}
