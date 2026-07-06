package Demo1;

import java.util.Scanner;

public class MovieOperator {
    //记录一个电影对象数组
    private Movie[] movies;

    public MovieOperator(Movie[] movies) {
        this.movies = movies;
    }

    //打印所有的电影信息
    public void printAllMovie() {
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            System.out.println(m.getId() + " " + m.getName() + " " + m.getPrice() + " " + m.getActor());
        }
    }

    //按id查询电影信息
    public void searchMovieByid() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查询的id：");
        int id = sc.nextInt();
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            if (m.getId() == id) {
                System.out.println(m.getId() + " " + m.getName() + " " + m.getPrice() + " " + m.getActor());
                return;
            }
        }
        System.out.println("没有找到该id对应的电影信息");
    }
}
