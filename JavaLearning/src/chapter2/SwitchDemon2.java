package chapter2;

import java.util.Scanner;

public class SwitchDemon2 {
    //break 穿透现象应用表示月份 （多个case 输出结果一样可以使用穿透性解决问题）
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查询的月份： ");
        int month = sc.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month+"月有31天");
                break;
            case 2:
                System.out.println(month+"月闰年有28天，其他有29天");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month+"月有30天");
                break;
            default:
                System.out.println("输入数据有误");
        }
    }

}
