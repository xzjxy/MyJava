package javabean;


// javabean 实体类，对象可以用在程序中封装类型
// 标准Javabean 满足：1 成员变量用private修饰， 2 提供对应的set get 方法
// 3 必须提供无参数构造器（默认存在），有参数可以不用

public class User {
    private String name;
    private double hight;
    private double salary;

    // 无参数构造器
    public User() {
    }

    // 有参数构造器
    public User(String name, double hight, double salary) {
        this.name = name;
        this.hight = hight;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
