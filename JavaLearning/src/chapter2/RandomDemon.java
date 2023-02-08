package chapter2;

import java.util.Random;

public class RandomDemon {
    // r.nextInt(bond)---> (0 ~ bond-1)之间任意随机数
    // 范围转换 （3~15）---》 r.nextInt(12) + 3 / 或者直接调用 //int num1 = r.nextInt(10,30); // left (inclusive) right(exclusive)
    public static void main(String[] args) {
        Random r = new Random();
        int num;
        long count = 0;
        double rate;
        int loop = 1000000000;
        for (int j = 0; j < 10; j++  ) {
            for (int i = 0; i < loop; i++) {
                num = r.nextInt(10);
                if (num == j){count++;}
    //            System.out.println(num);
            }
            rate = (double) count / loop;
            System.out.println("出现数字"+j+"的概率为" + rate);
            count = 0;
        }

    }
}
