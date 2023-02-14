package string;

public class stringOtherApi {
    // 其他常用api
    public static void main(String[] args) {
        String s1 = "abcde fkjl";

        //0 字符串转字符数组 : public char[] toCharArray()
        char[] chars = s1.toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars);
        System.out.println("-------字符串遍历-------");
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + "\t");
        }

        //1 字符串长度输出 : public int length()
        System.out.println(s1.length());

        //2 获取某个位置的字符 : public char charAt()
        System.out.println(s1.charAt(3));
        System.out.println("---------遍历字符串---------");
        for (int i = 0; i < s1.length(); i++) {
            System.out.print(s1.charAt(i) + "\t");
//            char c = s1.charAt(i);  // ctrl + alt + v
//            c = 'a';
        }

        //3 根据开始索引及结束索引返回字符串 : public String subString(int begainIndex, int endIndex)
        System.out.println(s1.substring(0, 3)); // 左闭右开

        //4 根据开始索引到末尾返回字符串 : public String subString(int begainIndex)
        System.out.println(s1.substring(3)); //左闭区间

        //5 新值替换旧值 : public String replace(Charsequence target, Charsequence replacement)
        String name1 = "金三胖是地表最强80后，金三胖棒棒的，金三胖胖胖的！";
        System.out.println(name1);
        String name11 = name1.replace("金三胖", "***");
        System.out.println(name11);

        //6 判断是否包含 : public boolean contains (CharSequence)
        boolean res = name1.contains("金三胖");
        System.out.println(res);

        //7 判断是否以某个字符串开始包含 : public boolean startsWith (String perfix)
        boolean res1 = name1.startsWith("金二");
        System.out.println(res1);

        //8 按规则将字符串分割为字符数组 : public String[] split(String s)
        String name4 = "乔峰，段誉，虚竹";
        String [] names = name4.split("，");
        System.out.println(names);
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
