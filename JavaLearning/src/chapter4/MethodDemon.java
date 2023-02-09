package chapter4;

public class MethodDemon {
    // 预先定义方法或者函数，便于函数复用

    public static int sum(int a, int b) {
        int i = a + b;
        return i;
    }

    public static void main(String[] args) {
        System.out.println(sum(13, 15));
    }

}
