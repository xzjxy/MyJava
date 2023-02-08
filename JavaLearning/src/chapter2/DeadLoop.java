package chapter2;

import java.util.Scanner;

public class DeadLoop {
    public static void main(String[] args) {
        // case 1: for 中间不存在终止条件

//        for(;;){
//            System.out.println("Hello World!");
//        }
//
        // case 2: while unreachable statement 无法到达， 上一条指令不结束 （经典死循环用法）

//        while(true){
//            System.out.println("Hello World!");
//        }

        // case 3: do while unreachable statement 无法到达， 上一条指令不结束
//        do {
//            System.out.println("Hello World!");
//        } while(true);

        // 应用案例：不断输入密码直到结果正确
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入傻妞开机密码");
        int password;
        int okPassword = 520;
        // method 1

        while(true){
            password = sc.nextInt();
            if (password == okPassword){
                System.out.println("登录成功-----");
                break; // 打破当前最近循环
            }else{
                System.out.println("密码错误，请重新输入。");
            }
        }
        // method 2

//        while(password != 520){
//            System.out.println("密码错误，请重新输入");
//            password = sc.nextInt();
//        }
//        System.out.println("密码正确，请进入使用");


    }
}
