package chapter2;

public class Break_continue {
    // break 结束当前最近的外侧循环（所在循环）// 或者switch分支
    //continue 只能在循环内部使用，结束最近循环中的单次循环
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            if(i == 3){break;} // 从3处跳出整个循环
        }
        System.out.println("----------------");
        for (int i = 0; i < 5; i++) {
            if (i == 3){continue;} // 跳出3单次循环，进入下一次
            System.out.println(i);
        }
        System.out.println("----------------------");
        for (int i = 0; i < 5; i++) {
            if(i == 3){break;} // 从3处跳出整个循环
            for (int j = 0; j < 5; j++) {
                System.out.print(i*j+" ");
            }
//            System.out.println(i);
            System.out.println();
        }
    }
}
