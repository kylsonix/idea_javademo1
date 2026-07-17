package proxydemo;




public class Star implements StarService{
    private String name;

    @Override
    public void sing(String name) {
        System.out.println(this.name+"明星开始唱："+ name);
    }

    @Override
    public String dance() {
        System.out.println(this.name+"明星开始跳舞...");
        return "跳完了";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Star(String name) {
        this.name = name;
    }
    public Star() {
    }
}
