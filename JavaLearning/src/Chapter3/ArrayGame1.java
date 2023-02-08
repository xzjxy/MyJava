package Chapter3;

import java.util.Random;
import java.util.Scanner;

public class ArrayGame1 {
    public static void main(String[] args) {
        // 随机生成 1-20 间的5个数，猜数字。为猜中 提示；”未命中“
        // 猜中提示”猜中了“，输出该数字第一次出现的位置，输出全部数据结束游戏
        // 跳出多种循环方法：1 预设一个bool变量，2 OUT: break OUT 利用our标识符跳出多重循环

        Random r = new Random();
        Scanner s = new Scanner(System.in);

        //猜测数组初始化
        int box[] = new int[5];
        for (int i = 0; i < 5; i++) {
            int e = r.nextInt(1, 20);
            box[i] = e;
        }
        //数组输出
        for (int i = 0; i < box.length; i++) {
            System.out.print(box[i] + " ");
        }
        //游戏开始
        System.out.println();
        System.out.println("数组完成了，开始猜吧");
        here:
        //循环标识符
        while (true) {
            int guess = s.nextInt();
            boolean res = false; // bool 变量跳出循环
            for (int i = 0; i < 5; i++) {
                if (guess == box[i]) {
                    System.out.println("命中了，" + guess + "是数组box中的第" + (i + 1) + "个元素");
                    break here;//结束整个循环
                }
            }
            System.out.println("没中，继续猜。");
        }
    }
}
