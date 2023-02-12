package chapter4;

public class EncryptNum {
    // 加密算法 1 数字每一位 +5， 2 每一位对10取余， 3 数字逆序输出
    // 解密算法 (0-4 5 6-9)  +5 (5 - 14) (5-9 0 1-4)
    // 数组进行地址传递时， 进入函数改变地址对应数值 / 单纯值传递不会改变
    public static void main(String[] args) {
        System.out.println(encry(1983));
        System.out.println(reEncry(8346));
        int c = 4;
        int d = 9;
        change(9, 4);
        System.out.println(c);
        System.out.println(d);
    }

    public static int encry(int num) {
        int res;
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100 % 10;
        int qian = num / 1000;
        int[] arry = {ge, shi, bai, qian};
        for (int i = 0; i < arry.length; i++) {
            arry[i] = (arry[i] + 5) % 10;
        }
        change(arry[0], arry[3]);
        change(arry[1], arry[2]);
        res = arry[0] * 1000 + arry[1] * 100 + arry[2] * 10 + arry[3];
        return res;
    }

    public static int reEncry(int num) {
        int res;
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100 % 10;
        int qian = num / 1000;
        int[] arry = {ge, shi, bai, qian};
        change(arry[0], arry[3]);
        change(arry[1], arry[2]);
        for (int i = 0; i < arry.length; i++) {
            if (arry[i] >= 5 && arry[i] <= 9) {
                arry[i] = arry[i] - 5;
            } else {
                arry[i] = arry[i] + 5;
            }
        }
        res = arry[0] * 1000 + arry[1] * 100 + arry[2] * 10 + arry[3];
        return res;
    }

    public static void change(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }

}
