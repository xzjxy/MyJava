package string;

import java.util.Scanner;

public class StringTest2 {
    // 用户名匹配密码登录，三次机会
    public static void main(String[] args) {
        String okName = "xuyepig";
        String okPassword = "123456";
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (count < 3) {
            System.out.println("请输入用户名：");
            String inputN = sc.next();
            System.out.println("请输入密码：");
            String inputp = sc.next();
            if (okName.equals(inputN) && okPassword.equals(inputp)) {
                System.out.println("登录成功！");
                break;
            } else {
                if (count == 2) {
                    System.out.println("输错三次，没机会了！");
                } else {
                    System.out.println("密码或用户名错误，请重新输入！");
                }
                count++;
            }
        }
    }

}
