package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class CollageStudentSearch {
    // 学生： 学号 姓名 年龄 班级
    // 实现通过学号搜索学生信息的功能
    // 双引号定义字符串：存储在堆内存的常量池中（相同内容只存储一份）
    // new定义的字符串：每new一次在堆内存中产生新的对象
    // 基本类型数据比较用”==“，引用内容比较要采用专用方法： String.equal?
    public static void main(String[] args) {
        CollegeStudent c1 = new CollegeStudent("20180301", "乔峰", 32, "大辽一班");
        CollegeStudent c2 = new CollegeStudent("20180302", "慕容复", 25, "大燕一班");
        CollegeStudent c3 = new CollegeStudent("20180303", "段誉", 22, "大理一班");
        CollegeStudent c4 = new CollegeStudent("20180304", "虚竹", 33, "西夏一班");

        ArrayList<CollegeStudent> drgeon = new ArrayList<>();
        drgeon.add(c1);
        drgeon.add(c2);
        drgeon.add(c3);
        drgeon.add(c4);
        for (int i = 0; i < drgeon.size(); i++) {
            CollegeStudent s = drgeon.get(i);
            System.out.println(s.getStudentNum() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getClassInfo());
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("输入带查询学生学号：");
        String studentNun = sc.next();
        search(studentNun, drgeon);
    }

    /**
     * 依据编号搜索学生的信息
     * @param studentNum
     * @param arr
     */
    public static void search(String studentNum, ArrayList<CollegeStudent> arr) {
        boolean res = false;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getStudentNum().equals(studentNum)) {
                System.out.println("查询成功，信息如下：");
                System.out.print(arr.get(i).getStudentNum() + "\t" + arr.get(i).getName() + "\t" + arr.get(i).getAge() + "\t" + arr.get(i).getClassInfo());
                res = true;
            }
        }
        if (res == false) {
            System.out.println("查询失败，请重新输入");
        }


    }
}
