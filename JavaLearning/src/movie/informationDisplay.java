package movie;

public class informationDisplay {
    // 1 设计电影类
    // 2 创建电影对象，封装电影信息
    // 3 封装解决，属性和方法属于谁的的问题
    public static void main(String[] args) {
        Movie[] m1 = new Movie[100];
        m1[0] = new Movie("Averges", 9.0, "Holk");
        m1[1] = new Movie("Thor", 8.0, "Christopher Hemsworth");
        m1[2] = new Movie("Ironman", 9.5, "Robert John Downey Jr.");
        for (int i = 0; i < m1.length; i++) {
            if (m1[i] != null) {
                System.out.println("------------");
                System.out.println(m1[i].getName());
                System.out.println(m1[i].getScore());
                System.out.println(m1[i].getActor());
            } else {
                break;
            }
        }
    }
}
