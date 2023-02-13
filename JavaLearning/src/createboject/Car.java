package createboject;

// 类（设计图）：对象共同特征的描述
    /*
    public class 类名{
    1、成员变量（代表属性，一般时名词）
    2、 成员方法（代表行为，一般时名词）
    3、构造器
    4、代码块
    5、内容块
    }
    */
// 对象：真实存在的案例 得到类的对象： 类名 对象名 = new 类名（）
// 如何使用对象 访问属性：对象名.成员变量 / 访问行为： 对象名.方法

public class Car {
    //属性（成员变量）
    String name;
    double price;

    // 无参数构造器
    public Car(){
        System.out.println("这是个无参数构造器");
    }

    // 有参数构造器
    public Car(String n, double p){
        System.out.println("这是个有参数构造器");
        name = n;
        price =p;
    }

    // 行为（方法/函数）
    public void start() {
        System.out.println(name + "启动了");
    }

    public void run() {
        System.out.println("价格为" + price + "万的" + name + "跑的很快");
    }
}