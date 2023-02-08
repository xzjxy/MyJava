package chapter2;

public class ForDemon {
    public static void main(String[] args) {
        for (int i = 0; i <= 3; i+=2) {
            System.out.println("Hello World!");
        }
        System.out.println("-------------------");
        //计算1·5的和
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("1-5的和是：" + sum);

        System.out.println("-------------------");
        //计算1·10的奇数和
        int sum1 = 0;
        for (int i = 1; i <= 10; i++) {
            if(i % 2 == 1) {
                sum1 += i;
            }
        }
        System.out.println("1-10的奇数和是："+sum1);

        //计算1·10的奇数和
        System.out.println("-------------------");
        int sum2 = 0;
        for (int i = 1; i <= 10; i+=2) {
          sum2 += i;
        }
        System.out.println("1-10的奇数和是："+sum2);

        //水仙花数：三位数 + 个十百位数的立方和是原数
        System.out.println("-------------------");
        int sum3 = 0;
        for (int i = 100; i <= 999; i+=1) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            if (Math.pow(ge,3)+Math.pow(shi,3)+Math.pow(bai,3) == i){
                sum3 += 1;
                System.out.print(i+"\t");
            }
        }
        System.out.println("\n"+"100-999的水仙花数有："+sum3+"个");

    }
}