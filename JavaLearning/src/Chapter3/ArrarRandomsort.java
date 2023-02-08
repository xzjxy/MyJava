package Chapter3;

import java.util.Random;

public class ArrarRandomsort {
    // 对数值元素随机排序输出
    public static void main(String[] args) {
        int[] ages = {22, 33, 13, 88, 98};
        System.out.println("初始数组为：");
        for (int i = 0; i < ages.length; i++) {
            System.out.print(ages[i] + " ");
        }
        // 数组随机排序
        Random r = new Random();
        int mid;
        int count = 0;
        int all = 1000000;
        for (int k = 0; k < all; k++) {

            // 方法一：每次往外拿出一个元素
//            for (int i = 0; i < (ages.length - 1); i++) {
//                int j = r.nextInt(i + 1, ages.length);
//                mid = ages[j];
//                ages[j] = ages[i];
//                ages[i] = mid;
//            }

            // 方法二：全随机生成结果
            for (int i = 0; i < ages.length; i++) {
                int j = r.nextInt(ages.length);
                mid = ages[j];
                ages[j] = ages[i];
                ages[i] = mid;
            }
            if (ages[0] == 22) {
                count++;
            }
        }
        //排序后的数组输出
        System.out.println();
        System.out.println("随机排序后数组：");
        for (int i = 0; i < ages.length; i++) {
            System.out.print(ages[i] + " ");
        }
        //验证排序是否随机
        System.out.println();
        System.out.println((double) count / all);
    }
}
