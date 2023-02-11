package chapter4;

public class MethodDemon {
    // 定义方法/函数 : 修饰符 返回值类型 方法名（形式参数）{ return 返回值;}
    // 返回值类型： int, float, string   strp into: 进入方法/函数
    // 无返回值类型 void 不能用return / 不能用变量接
    // 方法之间是平级关系  不可以嵌套定义（方法不能定义到main函数里面）  但可以嵌套调用
    // return 后在不能写代码 unreachable
    // 内存原理 ： 未执行时方法存在方法区 ， 执行时在栈内存运行
    public static void main(String[] args) {
        int[] arr = {89, 98, 78, 0, 67, 85};
        System.out.println(sum(23, 24));
        print();
        System.out.println(check(8));
        System.out.println(addn(8));
        System.out.println(max(arr));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    //计算1-n的和;
    public static int addn(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // 无返回值类型无形式参数举例
    public static void print() {
        System.out.println("Hello World!");
        System.out.println("Hello World!");
    }

    public static boolean check(int n) {
        return n % 2 == 0;
    }

    // 整数数组最大值
    public static int max(int[] array) {
        int max = array[0];
        for (int j : array) {
            if (max < j) {
                max = j;
            }
        }
        return max;
    }

}
