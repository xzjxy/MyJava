package createboject;


// public 类名必须与代码文件一样 Student。java
public class Student {
    String name;
    char sex;
    String hobby;
    String nation;
    double score;

    public void call() {
        System.out.println("学生的姓名是：" + name);
    }

    public void mark() {
        System.out.println(name + "的成绩是：" + score);
    }

    public void study(){
        System.out.println(nation+"的"+name+"性别："+sex+"成绩是："+score);
    }

}

//public class animal {} // 错误 只能有一个public

// 一个java 可以定义多个类
class animal{}

class plant{}