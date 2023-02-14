package string;

import java.util.Scanner;

public class StringEqual {
    //  == 用于比较地址， 不能用于字符串内容比较
    public static void main(String[] args) {
        String okName = "xuyepig";
        String okPassword = "123456";

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input you name: ");
        String inputName = sc.next();
        System.out.println("Please input you password: ");
        String inputPassword = sc.next();

        String s1 = new String("ABC");
        String s2 = new String("ABC");
        String s3 = new String("abc");
        // 直接地址比较
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        // 只比较内容
        System.out.println(s1.equals(s2));
        // 忽略大小写比较内容，一般用于验证码
        System.out.println(s1.equalsIgnoreCase(s3));

        if (okName.equals(inputName) && okPassword.equals(inputPassword)) {
            System.out.println("登陆成功！");
        } else {
            System.out.println("密码或者用户名输入错误！");
        }

        // 错误 比较方法
//        if (inputName == okName && inputPassword == okPassword) {
//            System.out.println("登录成功！");
//        } else {
//            System.out.println("账户名或者密码错误！");
//        }
    }
}
