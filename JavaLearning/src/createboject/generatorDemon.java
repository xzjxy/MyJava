package createboject;

public class generatorDemon {
    // 构造器：初始化一个类的对象，并返回对象的地址 Car c = new Car();
    // 任何定义默认自带无参数构造器，写不写都一样
    // 一旦定义了有参数构造器，默认的无参数构造器就没了需要单独写
    /*
    构造器定义：

    puclic class Car(){
    public Car(){} //无参数构造器
    public Car(String name, double price){} //有参数构造器
    }

    构造器初始化
    Car c = new Car(); // 无参数构造器，默认为null
    Car c = new Car("奔驰"，39.8); // 有参数构造器构造器，利用参数赋值

    */
    public static void main(String[] args) {
    Car c1 = new Car();
    c1.name = "特斯拉";
    c1.price = 30.8;

    Car c2 = new Car("保时捷",129.8);

    c1.run();
    c2.run();
    }
}
