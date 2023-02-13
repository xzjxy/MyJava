package Capsulation;

public class privateTest {
    /* 面向对象的三大特征：封装、 继承、 多态
       封装：告诉我们如何正确设计对象的属性和方法
       封装的原则思想：对象代表什么，就得封装相应的数据，并提供数据对应的行为
       人关门：人调用了关门的方法，门是自己关的，人是给了力 / 人画圆： 人调用了 圆的画方法（String对象，程序员只是调用）
       对象： 属性和方法
   */

    // private 防止赋值错误，更加安全优雅
    // 如何进行更好的封装
    public static void main(String[] args) {
        Student s1 = new Student();
//        s1.setAge(28);
//        System.out.println(s1.getAge());

        s1.setAge(-1);
        System.out.println(s1.getAge());

    }
}
