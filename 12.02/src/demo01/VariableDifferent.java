package demo01;

public class VariableDifferent {

        char a;//没有赋值，默认为null。成员变量，在整个类通用。即可以在下面的类里面使用。
        int b =10;//赋值了

        public void methodA(){
            int num=20;//局部变量，不赋值不能使用
            System.out.println(num);

        }

        public int methodB(int param){
            System.out.println(param);
            /*
            方法若带参数，则其实这个参数就是局部变量。
            但这个局部变量而已不用先在方法里面赋值。因为要调用有参数的方法，必须在调用的时候给参数赋值。
             */
            return param;
        }

}
