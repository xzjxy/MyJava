package Chapter3;

public class ArrayTraverse {
    // 数组遍历
    public static void main(String[] args) {
        int salarys[] = {16, 26, 6, 100, 38};
        // 数组求和
        int sum = 0;
        for (int i = 0; i < salarys.length; i++) {
            sum += salarys[i];
        }
        System.out.println(sum);

        // 数组求最值
        int max = salarys[0];
        for (int i = 0; i < salarys.length-1; i++) {
            if (max <= salarys[i+1]) {
                max = salarys[i+1];
            }
        }
        System.out.println("最大值为："+max);
    }
}
