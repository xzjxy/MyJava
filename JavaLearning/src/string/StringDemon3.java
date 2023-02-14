package string;

public class StringDemon3 {
    // 常见面试题汇总 （常量存储在 堆内存的 String常量池）（String 变量指向 String池内容）
    // String 对象 在 非String池 的堆内存开辟新区域
    public static void main(String[] args) {
        // 面试题1：每个new字符串对象会存储在堆内存中的 字符串常量池 ，双引号存储在堆内存
        String s2 = new String("abc");
        String s1 = "abc";
        System.out.println(s1 == s2); //

        // 面试题2：
        String s3 = "abc";
        String s4 = "ab";
        String s5 = s4 + "c"; // 变量在使用的时候才会分配地址运算
        System.out.println(s3 == s5); //

        // 面试题3：编译优化机制，"a"+"b"+"c" 直接转译 "abc"
        String s6 = "abc";
        String s7 = "a"+"b"+"c";
        System.out.println(s6 == s7); //

    }
}
