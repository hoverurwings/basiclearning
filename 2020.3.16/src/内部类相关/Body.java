package 内部类相关;

public class Body {

    public class Heart{
        void beat(){
            System.out.println("心跳");
            System.out.println("我的名字叫"+name);
        }
    }

    void move(){
        System.out.println("跑跳");
        new Heart().beat();
    }

    private String name;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
