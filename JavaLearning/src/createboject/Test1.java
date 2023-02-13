package createboject;

public class Test1 {
    // c1, c2 存储的是对象在内存中的地址
    // 栈内存（main方法 / 对象地址 / 方法引用地址）  堆内存（对象位置） 方法区
    public static void main(String[] args) {
        Car c = new Car();
        c.name = "宝马";
        c.price = 38.9;
        System.out.println(c.name);
        System.out.println(c.price);
        c.start();
        c.run();
        System.out.println(c); // 对象存储的地址 createboject.Car@27973e9b

        System.out.println("--------------");
        Car c2 = new Car();
        c.name = "奔驰";
        c.price = 39.9;
        System.out.println(c.name);
        System.out.println(c.price);
        c.start();
        c.run();

        System.out.println("--------------");
        Student s1 = new Student();
        s1.name = "乔峰";
        s1.nation = "大宋";
        s1.sex = '男';
        s1.score = 99;
//        s1.call();
//        s1.mark();
        s1.study();

        System.out.println("--------------");
        Student s2 = new Student();
        s2.name = "莫容复";
        s2.nation = "大燕";
        s2.sex = '女';
        s2.score = 90;
//        s2.call();
//        s2.mark();
        s2.study();
        System.out.println("----改变地址指向------");
        s2 = s1;//s1的地址赋值给s2, 两个变量指向同一个地址
        s2.nation = "契丹";
        s2.study();
    }
}
