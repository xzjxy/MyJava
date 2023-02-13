package createboject;

public class thisDemon {
    // this 可以出现在 构造器 和 方法 中， 代表当前对象的地址
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1);
        Car c2 = new Car("Jeep",30.5);
        c2.run();
        System.out.println(c2);
        // this 在方法中的应用
        c2.compete("Tesla");
    }
}
