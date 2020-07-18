package demo05;

//接口的常量定义和使用
/*
其实就是在接口里面定义一个常量
好记：final代表不可变即常量

注意1.关键词public static final可以不写
   2.接口中的常量必须进行赋值
   3.接口中常量的名称使用完全大写，下划线分割
   4.在main中使用接口名称.即可调用
 */
public interface Interface {

    public static final int NUM_WHATEVER=10;
}
