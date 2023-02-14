package javabean;

public class Test {
    public static void main(String[] args) {
        // 无参数初始化
        User u1 = new User();
        u1.setName("张全蛋");
        u1.setHight(180.5);
        u1.setSalary(1000.0);
        System.out.println(u1.getName());
        System.out.println(u1.getHight());
        System.out.println(u1.getSalary());

        // 有参数初始化

        User u2 = new User("王尼玛", 182.0, 8000);
        System.out.println(u2.getName());
        System.out.println(u2.getHight());
        System.out.println(u2.getSalary());
    }
}
