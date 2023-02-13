package chapter4;

import java.util.Random;
import java.util.Scanner;

public class DoubleColor {
    // 随机生成一组中奖号码 用户输入一组中奖号码 判断中奖情况
    // 红色号码（1-33） 6个红色； 蓝色号码（1-16）1个蓝色
    // 一等奖：6+1 （1000w）二等奖：（6+0）500w 三等奖 5+1:3000Y
    // 注意：必须判断当前号码是否在之前重复过
    // 四等奖：5+0 / 4+1 :200Y 五等奖：4+0 / 3+1 10Y 六等将：2+1 / 0+1 5Y
    public static void main(String[] args) {
        int[] prize = new int[7];
        int[] buy = new int[7];
        generate(prize);
        System.out.println();
//        generateTicket(buy);
        buy = userInput();
        int res = judge(prize, buy);
        System.out.println();
        System.out.println("恭喜你中了" + res + "等奖");

//        for (int i = 0; i < 10000; i++) {
//            generateTicket(buy);
//            int res = judge(prize, buy);
//            if (res > 0) {
//                System.out.println("恭喜你中了" + res + "等奖");
//            }
//        }

    }

    // 生成中奖号码 org数组
    public static void generate(int[] prize) {
        Random r = new Random();
        for (int i = 0; i < prize.length - 1; i++) {
            do {
                prize[i] = r.nextInt(1, 34);
            } while (checkSame(i, prize));
        }
        prize[prize.length - 1] = r.nextInt(1, 17);
        System.out.println("中奖号码");
        for (int i = 0; i < prize.length; i++) {
            System.out.print(i == prize.length - 1 ? prize[i] : prize[i] + " ");
        }
    }

    public static void generateTicket(int[] prize) {
        Random r = new Random();
        for (int i = 0; i < prize.length - 1; i++) {
            do {
                prize[i] = r.nextInt(1, 34);
            } while (checkSame(i, prize));
        }
        prize[prize.length - 1] = r.nextInt(1, 17);
        System.out.println("你的号码");
        for (int i = 0; i < prize.length; i++) {
            System.out.print(i == prize.length - 1 ? prize[i] : prize[i] + " ");
        }
    }


    // 判断几等奖
    public static int judge(int[] org, int[] arr) {
        int res = -1;
        int red = 0;
        int blue = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (check(arr[i], org)) {
                red++;
            }
        }
        blue = (arr[arr.length - 1] == org[org.length - 1]) ? 1 : 0;
        switch (red) {
            case 6:
                res = blue == 1 ? 1 : 2;
                break;
            case 5:
                res = blue == 1 ? 3 : 4;
                break;
            case 4:
                res = blue == 1 ? 4 : 5;
                break;
            case 3:
                res = blue == 1 ? 5 : -1;
                break;
            case 2:
                res = blue == 1 ? 6 : -1;
                break;
            case 1:
                res = -1;
                break;
            case 0:
                res = blue == 1 ? 6 : -1;
                break;
            default:
                System.out.println("数据有误");
        }


        return res;
    }

    // 判断数组中是否存在某个元素
    public static boolean check(int num, int[] arr) {
        boolean res = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                res = true;
            }
        }
        return res;
    }

    // 判断数组元素是否重复
    public static boolean checkSame(int index, int[] arr) {
        boolean res = false;
        for (int i = 0; i < index; i++) {
            if (arr[i] == arr[index]) {
                res = true;
            }
        }
        return res;
    }

    // 用户输入7个号码返回数组地址
    public static int[] userInput() {
        int[] ticket = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < ticket.length - 1; i++) {
            System.out.println("请输入第" + (i + 1) + "个红球号码，范围（1 - 33）");
            do {
                ticket[i] = sc.nextInt();
            } while (checkSame(i, ticket));
        }
        System.out.println("请输入第蓝球号码， 范围（1 - 16）");
        ticket[ticket.length - 1] = sc.nextInt();
        return ticket;
    }


}
