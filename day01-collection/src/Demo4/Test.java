package Demo4;

public class Test {
    public static void main(String[] args) {
        //完成电影案例
        //1、创建电影对象，定义电影类
        //2、创建一个电影操作对象，专门负责上架、下架、查询、以及下架某个主演的全部电影
        MovieService movieService = new MovieService();
        movieService.start();
    }
}
