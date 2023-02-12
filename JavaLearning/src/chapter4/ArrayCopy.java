package chapter4;

public class ArrayCopy {
    // 一个数组元素复制到另一个数组
    public static void main(String[] args) {
        int[] arr1 = {23, 54, 67, 90};
        int[] arr2 = new int[arr1.length];
        copy(arr1, arr2);
        output(arr1);
        System.out.println(" ");
        output(arr2);
    }

    // 复制元素函数;
    public static void copy(int[] org, int[] dst) {
        if (org != null) {
            for (int i = 0; i < org.length; i++) {
                dst[i] = org[i];
            }
        }
    }

    // 数组元素输出
    public static void output(int[] org) {
        System.out.print("[");
        for (int i = 0; i < org.length; i++) {
            System.out.print(i == org.length - 1 ? org[i] : org[i] + " ");
        }
        System.out.print("]");
    }
}
