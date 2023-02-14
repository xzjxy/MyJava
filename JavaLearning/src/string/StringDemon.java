package string;

public class StringDemon {
    // String 对象也是存储地址 : 定义字符串变量指向字符串对象
    // String 变量每次修改产生新的字符串对象，原来的字符串对象没有发送变化
    public static void main(String[] args) {
        String name = "Today";
        name += " is a ";
        name += "nice day!";
        System.out.println(name);
    }

}
