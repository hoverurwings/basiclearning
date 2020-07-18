package demo02;

public class OnePiece {
    private int age;
    private String name;
    private int id;
    static String level = "四皇之一";
    private static int idcounter = 1;

    public OnePiece(int age, String name) {
        this.age = age;
        this.name = name;
        this.id = idcounter++;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
