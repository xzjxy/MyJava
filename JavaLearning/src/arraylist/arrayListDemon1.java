package arraylist;

import java.util.ArrayList;

public class arrayListDemon1 {
    // 数组：类型固定  长度固定
    // 集合：大小不固定，启动后可以动态变化，类型也可以选择不固定，适合需要增删的场景
    // API多，功能丰富
    public static void main(String[] args) {
        // 1、 创建arrayList集合的对象
        ArrayList list = new ArrayList();

        // 2、 arrayList中增删元素 boolean ArrayList.add(e) :返回结果是添加成功与否的判断，一般不会失败
        list.add("Java");
        list.add(18);
        list.add(false);
        System.out.println(list.add(false));

        System.out.println(list); // 地址但是输出结果是元素

        // 3、指定位置添加元素 boolean ArrayList.add(index, e) 指定Index添加后续元素往后移动
        list.add(1,27);
        System.out.println(list );

        // ArrayList<E>：定义泛型类，编译阶段约束集合对象只能操作某种类型数据
        // 1： ArrayList<String>: 此集合只能存储操作字符串类型元素
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Hello");
//        list1.add(23); // 报错，存储类型错误
        System.out.println(list1);

        // 2： ArrayList<Integer>: 此集合只能存储操作整形类型元素
//        ArrayList<int> list2 = new ArrayList<Object>(); //报错不支持基本类型，只能用
//        list2.add("Hello"); // 报错，存储类型错误
//        list2.add(23);

        // 3： 集合只能存储引用类型，不支持基本数据类型 Integer 是 int 的引用类型
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(23);
        list2.add(38);
        System.out.println(list2);

    }
}
