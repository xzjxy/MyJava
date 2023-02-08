package chapter2;

import java.util.Random;
import java.util.Scanner;

public class RandomGame1 {
    // 计算机生成随机数（0~100），由其采用二分法进行猜测
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(100) + 1;
        System.out.println("正确答案是："+num);
//        Scanner sc = new Scanner(System.in);
        int guess ;
        int count = 0;
        int i = 0;
        int j = 100;
        while (true){
            guess = (i+j)/2;
            if (guess == num){
                System.out.println("猜对了，答案是"+guess);
                break;
            } else if (guess > num) {
//                j = (int) (i+j) / 2;
                j =  (i+j) / 2;

            } else {
//                i = (int) (i+j) / 2;
                i = (i+j) / 2;
            }
            count++;
        }
        System.out.println("一共猜了"+count+"次");
    }
}
