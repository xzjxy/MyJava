package chapter2;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    // 随机产生0到100之间的数，用户猜大小知道猜到结束游戏
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(100);
//        System.out.println("答案为：" + num );
        Scanner s = new Scanner(System.in);
        int guess;
        System.out.println("游戏开始请猜数字！");
        while (true){
            guess = s.nextInt();
            if(guess == num){
                System.out.println("猜对了");
                break;
            } else if (guess > num) {
                System.out.println("猜的数字大了");
            }else {
                System.out.println("猜的数字小了");
            }

            }
        }
    }
