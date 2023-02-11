package chapter4;

public class ArrOperation {
    // return 具有跳出循环的作用。
    public static void main(String[] args) {
        int[] arry1 = {21, 34, 54, 89};
        int[] arry2 = null;
        int[] arry3 = {21, 34, 54, 89};
        int[] arry4 = null;
        printArray(arry1);
        printArray(arry2);
        System.out.println(indexArray(arry1, 340));
        System.out.println(checkArray(arry1, arry2));
        System.out.println(checkArray(arry1, arry3));
        System.out.println(checkArray(arry4, arry2));
    }

    //输入数组，按规定打印整数数组内容
    public static void printArray(int[] arry) {
        System.out.print("[");
        if (arry != null && arry.length > 0) {
            for (int i = 0; i < arry.length; i++) {
                System.out.print(i == arry.length - 1 ? arry[i] : arry[i] + ",");
            }
        }
        System.out.println(']');
    }

    // 查询元素索引返回数字，不存在返回-1
    public static int indexArray(int[] arry, int a) {
        int index = -1;
        for (int i = 0; i < arry.length; i++) {
            if (a == arry[i]) {
                index = i;
                break;
            }
        }
        return index;
    }

    // 判断两个数组元是否一样 1： 两空 / 2： 1空 1不空 / 3：都不空
    //        if(arry1 == null || arry2 == null){
//            if (arry1 ==null && arry2 ==null){return true;}
//            else{return false;}
//        }else if(arry1.length != arry2.length){
//         return false;}
//        else{
//            for (int i = 0; i < arry1.length; i++) {
//             if (arry1[i] != arry2[i]){
//                 return false;
//             }else{return true;}
//        }
    public static boolean checkArray(int[] arry1, int[] arry2) {
//        boolean res;
        if (arry1 == null && arry2 == null) {
            return true;
        } else if ((arry1 != null && arry2 != null) && (arry1.length == arry2.length)) {
            for (int i = 0; i < arry1.length; i++) {
                if (arry1[i] != arry2[i]) {
                    return false;
//                    break;
                }
            }
        } else {
            return false;
        }
        return true;
    }

    public static boolean checkArray1(int[] arry1, int[] arry2) {
        boolean res =false;
        if (arry1 == null && arry2 == null) {
            res = true;
        } else if ((arry1 != null && arry2 != null) && (arry1.length == arry2.length)) res = checkSame(arry1, arry2);
        return res;
    }

    // 相同长度的数组检查
    public static boolean checkSame(int[] arry1, int[] arry2) {
        boolean res = true;
        for (int i = 0; i < arry1.length; i++) {
            if (arry1[i] != arry2[i]) {
                return false;
            }
        }
        return res;
    }

}
