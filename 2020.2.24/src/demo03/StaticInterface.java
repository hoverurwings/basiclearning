package demo03;

//静态方法相关
public interface StaticInterface {

    static void method(){
        System.out.println("接口静态方法执行");
        //即，静态方法是藏在接口里面的，实现类不能调用
    }
}
