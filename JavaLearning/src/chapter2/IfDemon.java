package chapter2;

import java.util.Scanner;

public class IfDemon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入你的心跳");
        int hartbeat = sc.nextInt();
        if (hartbeat > 60 && hartbeat < 120) {
            System.out.println("你心跳OK");
        } else if(hartbeat >= 120) {
            System.out.println("你心跳高了");
        }else {
            System.out.println("您心跳低了");
        }
    }
}
