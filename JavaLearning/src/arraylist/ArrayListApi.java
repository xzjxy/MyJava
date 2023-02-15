package arraylist;

import java.util.AbstractList;
import java.util.ArrayList;

public class ArrayListApi {
    //Arraylist常用Api使用
    public static void main(String[] args) {
        // 1 返回索引处的的元素  public E get(int index)
        ArrayList list = new ArrayList<>();
        list.add("Hello");
        list.add("Java");
        list.add(28);
        list.add(false);
        list.add("Java");
        System.out.println("原数组：");
        System.out.println(list);
        System.out.println("返回 index 2 出的元素");
        System.out.println(list.get(2));

        // 2 返回集合长度  public int size()
        System.out.println("返回集合长度");
        System.out.println(list.size());

        // 元素遍历：
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        // 3 删除指定位置元素，返回删除值  public E remove (int index)
        System.out.println("移除 index 1 处的值"); // 移除第一个元素值
        System.out.println(list.remove(1));
        System.out.println(list);

        // 4 删除指定的素，返回是否删除成功  public boolean remove (object o)
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Java");
        list2.add("乔峰");
        list2.add("Java");
        list2.add("慕容复");
        System.out.println(list2);
        boolean b1 = list2.remove("Java");
        System.out.println(list2);
//        System.out.println(list.remove(29));

        // 5 修改指定索引处的元素，返回被修改的元素  public E set (index, E element)
        System.out.println("修改index 1元素 hello 为 bye");
        list.set(0,"bye");
        System.out.println(list);
    }
}
