package Note;


public class VariableArgs {
        public static void fun(int...x){
            System.out.println("Hello I am variableArgs");
            System.out.println(x[1]);
        }

    public static void main(String[] args) {
        //fun();
        fun(1,2,3);
        //!fun(1,2,3,); 不能多逗号
        //!fun({1,2,3}); 不能用数组作为参数
    }

}
