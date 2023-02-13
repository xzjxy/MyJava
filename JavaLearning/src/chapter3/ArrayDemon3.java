package chapter3;

public class ArrayDemon3 {
    // 数组最大元素索引 length-1(元素个数大于0)
    // 数组赋值 array[i] = value， 数组定义后长度类型固定
    // int ages[] 与 int[] ages 用法相同, 强类型语言（数据必须与存储类型一致）
    // 数组的动态初始化：只确定数组类型及长度，之后再赋值，未赋值采用默认 (0；0.0，false, null)
    public static void main(String[] args) {
        int[] ages = {23, 10, 67, 78};
        int scores[] = {90, 67, 80, 56};
//        int nums [] = {34, 45, 56.9}; //类型错误
//        int[] nums4 = new int[3]{23, 45, 67};//动态与静态初始化方式不能混用
        System.out.println(ages.length);
        System.out.println(ages);
        ages[0] = 19; //赋值
        for (int i = 0; i < ages.length; i++) {
            System.out.print(ages[i] + " ");
        }
        System.out.println();
        System.out.println("-------动态初始化数组--------");
        int num[] = new int[3]; //
        float[] num1 = new float[3];
        boolean[] num2 = new boolean[3];
        String[] num3 = new String[3];
//        num[0] = 10;
        System.out.println(num[0]); //采用默认值 0
        System.out.println(num1[0]); //采用默认值 0.0
        System.out.println(num2[0]); //采用默认值 false
        System.out.println(num3[0]); //采用默认值 null
    }
}