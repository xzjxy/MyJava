package chapter4;

import java.util.Random;

public class RandomCode {
    // 随机产5位验证码， 数字0-9(48-57)， 大小写字母A-Z (65-90) 小写字母 a-z (97-122)
    // 0-9  10-35 36-61
    // 字符串与字符运算  String1 += char1;
    // 返回字符串指定位置字符内容（输入为字符串String""，输出为char ''） String1.charAt(index)
    public static void main(String[] args) {
        System.out.println(chance(10000000, 10));// 判断随机性， 任意位置数字出现的概率
        System.out.println(createCode1(5));
        Random r = new Random();
//        System.out.println((char) (65));
//        String s1 = "";
//        char c = 'a';
//        s1 += c;
//        String s = String.valueOf(c); // 字符数据转字符串
//        System.out.println(s);
//        System.out.println(createCode(5));

//        // 范围循环打印
//        for (int i = 0; i < 62; i++) {
//            System.out.print(transnum(i) + " ");
//        }
//        System.out.println();


//        String code = "";
//        for (int i = 0; i < 5; i++) {
//            int temp = r.nextInt(62);
//            code += transnum(temp);
//        }
//        System.out.println(code);
    }

    // 随机数转换为ASCII, ASCII字符 转为字符串
    public static String transnum(int num) {
        String res;
        if (num >= 0 && num <= 9) {
            res = String.valueOf((char) (num + 48)); // 字符转字符串操作
        } else if (num >= 10 && num <= 35) {
            res = String.valueOf((char) (num + 55));
        } else {
            res = String.valueOf((char) (num + 61));
        }
        return res;
    }

    // 随机生成 n 位随机验证码 // 数字概率 10/（10+26+26）
    public static String createCode(int n) {
        String code = "";
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int num = r.nextInt(62);
            if (num <= 9) {
                code += ((char) (num + 48));
            } else if (num <= 35) {
                code += ((char) (num + 55));
            } else {
                code += ((char) (num + 61));
            }
        }
        return code;
    }

    // 随机生成 n 位随机验证码方法二 : 数字/大写/小写 概率相等 0.33
    public static String createCode1(int n) {
        String code = "";
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int type = r.nextInt(3);
            int num;
            switch (type) {
                case 0:
                    num = r.nextInt(48, 58);
                    code += (char) num;
                    break;
                case 1:
                    num = r.nextInt(65, 91);
                    code += (char) num;
                    break;
                case 2:
                    num = r.nextInt(97, 123);
                    code += (char) num;
                    break;

            }
        }
        return code;
    }

    // 判断任意位置出现数字的概率
    public static double chance(int n, int m) {
        double chance;
        double coount = 0.0;
        for (int i = 0; i < n; i++) {
            String s1 = createCode(m);
            if (s1.charAt(0) == '0') {
                coount++;
            }
        }
        chance = coount / n;
        return chance;
    }


}
