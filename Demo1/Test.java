package Demo1;

public class Test {
    public static void main(String[] args) {
        //目标简易电影信息展示
        //1、设计电影类Movie，以便创建电影对象，封装电影数据。
        //2、封装系统中的全部电影数据，并创建一个数组保存
        //3、创建电影操作对象，专门用来负责电影数据的业务操作


        //创建电影对象数组，保存电影对象
        Movie[] movies = new Movie[6];
        movies[0] = new Movie(1,"唐顿庄园",95,"张三");
        movies[1] = new Movie(2,"速度与激情",85,"李四");
        movies[2] = new Movie(3, "流浪地球", 92, "王五");
        movies[3] = new Movie(4, "复仇者联盟", 88, "赵六");
        movies[4] = new Movie(5, "千与千寻", 96, "宫崎骏");
        movies[5] = new Movie(6, "泰坦尼克号", 90, "卡梅隆");


        MovieOperator mo=new MovieOperator(movies);
        mo.printAllMovie();
        mo.searchMovieByid();


    }
}
