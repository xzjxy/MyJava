package chapter2;

import java.util.Scanner;
// swith (值) 值不支持 double float long 这些值判断不准确（小数运算不精确，与硬件。有关），long 分支过大
// case 后的值，不能接变量，内容不能重复
// break 不能少，防止数据穿透
public class SwitchDemon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入今天的日期(范围1~7): ");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("工作吧，狗子！");
                break;
            case 2:
                System.out.println("工作吧，狗子！");
                break;
            case 3:
                System.out.println("工作吧，狗子！");
            case 4:
                System.out.println("工作吧，狗子！");
//                break;
            case 5:
                System.out.println("工作吧，狗子！");
                break;
            case 6:
                System.out.println("放假，休息吧！");
                break;
            case 7:
                System.out.println("放假，休息吧！");
                break;
            default:
                System.out.println("数据输入有误");
        }
    }
}