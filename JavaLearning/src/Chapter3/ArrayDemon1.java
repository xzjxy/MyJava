package Chapter3;

public class ArrayDemon1 {
    // 初始化数组
    public static void main(String[] args) {
        // 静态初始化数组 数据类型[] 数组名 = new [] {元素1， 元素2.....}
        double[] scores = new double[]{89.9, 78.5, 59.0, 88.0};
        // 简化类型 数据类型[] 数组名 = {元素1， 元素2.....}
        int[] ages = {23, 10, 67, 78};
        String[] names = {"John", "Tom", "Alice"};
        System.out.println(scores); // 数组的首地址 [D@2f92e0f4 数组+Double+16为地址
        System.out.println(scores[0]); //
    }
}
