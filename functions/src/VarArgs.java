import java.util.Arrays;

public class VarArgs {
    static void main(String[] args) {
        sum(10,20);
        sum2("10",34,5);
    }

    static void sum(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void sum2(String a,int ...v){
        System.out.println(Arrays.toString(v));
    }
}
