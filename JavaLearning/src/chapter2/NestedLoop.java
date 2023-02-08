package chapter2;

public class NestedLoop {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                count++;
                if(j == 2){
                    break;// 跳出当前最近循环
                }
            }
        }
        System.out.println("循环了"+count+"次");

        System.out.println("-------------------");
        // *打印 4*5行矩阵
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("-------------------");
        //打印乘法口诀表
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }
}
