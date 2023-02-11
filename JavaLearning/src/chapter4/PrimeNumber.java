package chapter4;

import java.util.Scanner;

public class PrimeNumber {
    // 找到101到200之间的所有素数 输出所有素数
    // 素数：从2开始到其一半范围内没有能整除的数 / 2 开始到其开方的
    // Math.pow(double a, double b) a的b次方
    public static void main(String[] args) {
        System.out.println("请输入想要查找的范围：");

//        System.out.println(Math.pow(3, 3));
//        System.out.println((int) Math.pow(99, 1.0 / 2));

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入想要查找的范围下界：");
        int low = sc.nextInt();
        System.out.println("请输入想要查找的范围的上界：");
        int high = sc.nextInt();
        int count = 0;
        if (high < low || low < 2) {
            System.out.println("范围错误！");
        } else {
            for (int i = low; i <= high; i++) {
                if (checknum1(i)) {
                    count++;
                    System.out.print(i + " ");
                }
            }
            System.out.println();
            System.out.println("一共有" + count + "个素数");
        }
//        System.out.println(all(2, 10000));
//        System.out.println(all1(2, 10000));
    }

    public static int all(int low, int high) {
        int count = 0;
        if (high < low || low < 2) {
            System.out.println("范围错误！");
        } else {
            for (int i = low; i <= high; i++) {
                if (checknum(i)) {
                    count++;
                    System.out.print(i + " ");
                }
            }
            System.out.println();
            System.out.println("一共有" + count + "个素数");
        }
        return count;
    }

    // 素数个数统计
    public static int all1(int low, int high) {
        int count = 0;
        if (high < low || low < 2) {
            System.out.println("范围错误！");
        } else {
            for (int i = low; i <= high; i++) {
                if (checknum1(i)) {
                    count++;
                    System.out.print(i + " ");
                }
            }
            System.out.println();
            System.out.println("一共有" + count + "个素数");
        }
        return count;
    }

    // 开方范围判断素数
    public static boolean checknum(int num) {
        boolean res = true;
        int j = (int) Math.pow(num, 0.5);
        for (int i = 2; i <= j; i++) {
            if (num % i == 0) {
                res = false;
                break;
            }
        }
        return res;
    }

    // 一半范围计算素数
    public static boolean checknum1(int num) {
        boolean res = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                res = false;
                break;
            }
        }
        return res;
    }
}
