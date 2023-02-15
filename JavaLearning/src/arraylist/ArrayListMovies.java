package arraylist;

import java.util.ArrayList;

public class ArrayListMovies {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();
        Movie m1 = new Movie("Averges", 9.0, "Holk");
        Movie m2 = new Movie("Thor", 8.0, "Christopher Hemsworth");
        Movie m3 = new Movie("Ironman", 9.5, "Robert John Downey Jr.");

        movies.add(m1);
        movies.add(m2);
        movies.add(m3);
        movies.add(m1);
        System.out.println("------展示电影信息--------");
        for (int i = 0; i < movies.size(); i++) {
            display(movies.get(i));
        }

        // 地址不是差四个字节， 实际无相关性
        ArrayList<People> town = new ArrayList<>();
        People p1 = new People();
        People p2 = new People();
        p1.age = 28;
        p2.age = 27;
        town.add(p1);
        town.add(p2);
        System.out.println(town);
    }

    public static void display(Movie m) {
        System.out.println(m.getName() + " ");
        System.out.println(m.getScore() + " ");
        System.out.println(m.getActor() + " ");
        System.out.println("-----------------");
    }

}
