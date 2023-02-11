package chapter4;

public class ParametersDemon {
    // java 实参到形参传递只是  值传递  不改变变量的值
    // 数组元素参数传递是 地址 可能会导致 数组本身内容变化
    public static void main(String[] args) {
        int a = 20;
        int[] arr = {20, 30, 40, 79};
        System.out.println("a value before change:" + a);
        change(a);
        System.out.println("a value after change:" + a);
        change1(a);
        System.out.println("a value after change1:" + a);
        change2(arr);
        System.out.println("arr[0] value after arry change2:" + arr[0]);


    }

    // 实参形参传递规律
    public static void change(int a) {
        System.out.println("Hello");
        a = 30;
        System.out.println("Finished!");
    }

    public static void change1(int a) {
        System.out.println("Hello");
        a = 30;
        System.out.println("Finished!");
    }

    // arr数组传递案例， 地址传递导致内容变化
    public static void change2(int[] arr) {
        arr[0] = 30;
        System.out.println("Finished!");
    }
}
