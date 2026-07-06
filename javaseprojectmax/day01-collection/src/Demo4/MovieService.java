package Demo4;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieService {
    //准备集合容器
    private static final List<Movie> movies = new ArrayList<>();
    private static final Scanner sc = new Scanner(System.in);
    public void start() {
        while (true) {
            //1、准备操作界面
            System.out.println("========电影信息操作系统========");
            System.out.println("1、上架电影");
            System.out.println("2、下架电影");
            System.out.println("3、查看某个电影");
            System.out.println("4、查看所有电影");
            System.out.println("5、修改某个电影的数据");
            System.out.println("6、下架某主演的电影");
            System.out.println("7、退出系统");

            //开始操作
            System.out.println("请输入操作序号：");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    addMovie();
                    break;
                case "2":
                    removeMovie();
                    break;
                case "3":
                    getMovie();
                    break;
                case "4":
                    getAllMovie();
                    break;
                case "5":
                    updateMovie();
                    break;
                case "6":
                    removeMovieByActor();
                    break;
                case "7":
                    System.out.println("欢迎下次光临！");
                    System.exit(0);

                default:
                    System.out.println("输入错误！");
            }
        }

    }
    //修改电影数据
    private void updateMovie() {
        System.out.println("===========修改电影数据===========");
        System.out.println("请输入电影名称：");
        Movie movie = getMovieByName(sc.next());
        if (movie != null) {
            System.out.println("请输入修改后的电影名称：");
            movie.setName(sc.next());
            System.out.println("请输入修改后的电影评分：");
            movie.setScore(sc.nextDouble());
            System.out.println("请输入修改后的主演：");
            movie.setActor(sc.next());
            System.out.println("请输入修改后的价格：");
            movie.setPrice(sc.nextDouble());
            System.out.println("修改成功！");
        }
        //修改后的数据
        System.out.println(movie);

    }

    //上架电影
    private void addMovie() {
        System.out.println("===========上架电影===========");
        Movie movie = new Movie();
        System.out.println("请输入电影名称：");
        movie.setName(sc.next());
        System.out.println("请输入电影评分：");
        movie.setScore(sc.nextDouble());
        System.out.println("请输入主演：");
        movie.setActor(sc.next());
        System.out.println("请输入价格：");
        movie.setPrice(sc.nextDouble());
        movies.add(movie);
        System.out.println("上架成功！");
    }
    //下架电影
    private void removeMovie() {
        System.out.println("===========下架电影===========");
        System.out.println("请输入电影名称：");
        Movie movie = getMovieByName(sc.next());
        if (movie != null) {
            movies.remove(movie);
            System.out.println("下架成功！");
        }
    }

    //查看某个电影
    private void getMovie() {
        System.out.println("===========查看某个电影===========");
        System.out.println("请输入电影名称：");
        Movie movie = getMovieByName(sc.next());
        if (movie != null) {
            System.out.println(movie);
            System.out.println("查询成功！");
        }
    }

    //查看所有电影
    private void getAllMovie() {
        System.out.println("===========查看所有电影===========");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    //下架某主演
    private void removeMovieByActor() {
        System.out.println("===========下架某主演===========");
        System.out.println("请输入主演名称：");
        String actor = sc.next();
        movies.removeIf(movie -> movie.getActor().contains(actor));
        System.out.println("下架成功！");
    }
    //查询某电影并返回电影对象
    private Movie getMovieByName(String name) {
        for (Movie movie : movies) {
            if (movie.getName().equals(name)) {
                return movie;
            }
        }
        System.out.println("未找到该电影！");
        return null;
    }

}
