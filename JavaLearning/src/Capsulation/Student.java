package Capsulation;

public class Student {
    // 对象变量私有化，只能在对象内部使用， 需要自己写set 及 get 出入口
    private int age;

    public void setAge(int age) {
        if (age > 0 && age < 200) {
            this.age = age;
        }else {
            System.out.println("年龄输入有误！");
        }
    }

    public int getAge(){
        return age;
    }
}
