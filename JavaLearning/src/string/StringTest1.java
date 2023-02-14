package string;

import java.util.Random;
import java.util.Scanner;

public class StringTest1 {
    //随机产生5位验证码，可以是大写小写数字
    //String类型存储A-Z(65-90),  a-z(97-122),  0-9(48-57)
    //循环5次
    public static void main(String[] args) {
        String dict = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        System.out.println(dict.length());
        String code = "";
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            int index = r.nextInt(dict.length());
            code += dict.charAt(index);
        }
        System.out.println(code);
    }
}
