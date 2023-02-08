package chapter2;

public class WhileDemon {
    public static void main(String[] args) {
        int i = 0;
        while(i<3){
            System.out.println("Hello World!");
            i++;
        }
        System.out.println("---------------------");

        // do-while 先执行一次在判断
        System.out.println("---------------------");
        int j = 0;
        do{
            System.out.println("Hello World!");
            j++;
        } while(j < 3);

        //折纸问题 0.1mm 纸 珠穆朗玛峰 8848.86m , 不知道循环多少次 用while
        // 可以用for代替
        System.out.println("---------------------");
        double thick = 0.01;
        int count = 0;
        for (; thick < 884886; ){
            thick*=2;
            count ++;
        }
        System.out.println("最少需要折"+count+"次");

        System.out.println("--------------------");
        double thick1 = 0.01;
        int count1 = 0;
        while(thick1 < 884886){
            thick1 *= 2;
            count1 ++;
        }
        System.out.println("最少需要折"+count1+"次");

    }
}
