package chapter3;

public class ArrayDemon2 {
    // 数组元素的访问  数组名[索引]
    // 数组长度提取 array.length
    // 数组赋值 array[i] = value
    public static void main(String[] args) {
        int[] ages = {23, 10, 67, 78};
//        int ages [] = {23, 10, 67, 78};// 第二种赋值方法
        System.out.println(ages.length);
        ages[0] = 19; //赋值
        for (int i = 0; i < ages.length; i++) {
            System.out.print(ages[i] + " ");
        }
    }
}
