package arraylist;

import java.util.ArrayList;

public class ArrayListDemon {
    //去掉成绩80分以下的数据
    public static void main(String[] args) {
        // 集合解决
        ArrayList<Integer> list = new ArrayList<>();
        list.add(98);
        list.add(77);
        list.add(66);
        list.add(89);
        list.add(79);
        list.add(60);
        list.add(100);
        System.out.println("原集合是：" + list);
        // method 1
//        for (int i = 0; i < list.size(); i++) {
//            int score = list.get(i);
//            if (score < 80) {
//                list.remove(i);
//                i--;  // 每次更新指针
//            }
//        }

        // method 2 从后往前删
        for (int i = list.size() - 1; i >= 0; i--) {
            int score = list.get(i);
            if (score < 80) {
                list.remove(i);
            }
        }
        System.out.println("删选后的集合：" + list);


        // 数组解决
        int[] scores = {98, 77, 66, 89, 79, 60, 100}; //数组赋值容易
//        int[] scoresN = new int[scores.length]; // 必须固定长度 用不了
        ArrayList<Integer> list1 = new ArrayList<>(); // 使用集合动态长度
        for (int i = 0; i < scores.length; i++) {
            if(scores[i]>80){list1.add(scores[i]);}
        }
        System.out.println(list1);

        // 数组和集合分别存储 student 对象
        // 数组用于 Student 对象
        // ******堆内存内部存放 对象地址 及 对象的数据  /  栈内存内存放 main方法及可见变量的地址****

        System.out.println("这是列表对象方法！");
        Student [] class1 = new Student[2];
        int [] scores1 = new int[3];
        class1[0] = new Student("张三",23);
        class1[1] = new Student("李四",18);
        System.out.println(class1); // 指向整个对象的地址 [Larraylist.Student;@15aeb7ab
        System.out.println(class1[0]); // 对象0的地址 arraylist.Student@7b23ec81
        System.out.println(class1[1]); // 对象1的地址 arraylist.Student@6acbcfc0
        System.out.println(class1[0].name);
        System.out.println(class1[0].age);

        System.out.println("这是集合对象方法！");
        // 集合用于 Student对象
        ArrayList<Student> class2 = new ArrayList<>();
        Student s1 = new Student("乔峰",32);
        Student s2 = new Student("慕容复",25);
        class2.add(s1);
        class2.add(s2);
        System.out.println(class2); // [arraylist.Student@5f184fc6, arraylist.Student@3feba861]
        System.out.println(class2.get(0)); // arraylist.Student@5f184fc6
        System.out.println(class2.get(1)); // arraylist.Student@3feba861
        System.out.println(class2.get(0).name);
        System.out.println(class2.get(0).age);



    }

}
