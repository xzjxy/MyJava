package string;


// String 类创建对象2种方法
public class StringDemon1 {
    public static void main(String[] args) {
        // 方法一： 直接使用 ”“， 在字符串常量池存储 只存储一份
        // 双引号创建的字符串对象，在字符串常量池（堆内存）中存在同一份
        String s1 = "Hello World!";

        // 方法二2:
        // 1 public String(); :创建一个空白字符串，几乎不用
        // new 构造的对象每次产生新对象 分开存放在堆内存 且地址不同（堆中相同内容不合并） /
        // 地址存放在栈内存（栈中存放的地址不会根据堆内容相同合并）
        String s2 = new String();
        System.out.println(s2);

        String a1 = "abc";
        String a2 = "abc";
        System.out.println(a1 == a2); //true 地址相同

        char[] chs = {'a', 'b', 'c'};
        String a3 = new String(chs);
        String a4 = new String(chs);
        System.out.println(a3 == a4); //False  new 方法每次产生一个新地址

        // 2 public String(String) : 根据传入字符串内容来创建，几乎不用；
        String s3 = new String("Hello!");
        System.out.println(s3);

        // 3 public String(char[] c): 依据传入字符数组内容来创建字符串对象
        char[] chars = {'我', 'l', 'o', 'l'};
        System.out.println(chars);
        System.out.println(chars[0]);
//        String s4 = chars;
        String s4 = new String(chars);
//        System.out.println(s4[0]);
        System.out.println(s4);

        // 4 public String(Byte[] c): 依据传入字符数组内容来创建字符串对象 (ASCII 转字符串)
        byte[] bytes = {78, 76, 90, 97};
        String s5 = new String(bytes);
        System.out.println(s5);
    }
}
