public class Overloading {

    static void main(String[] args) {
//        sum("hi");
        sum(1,2,3);

    }

    static void sum(int num){
        System.out.println(num + " Num");
    }

    static void sum(int num1, int num2){
        System.out.println("2 arguments given");
    }

    static void sum(int ...num){
        System.out.println("multiple arguments given");
    }




    static void sum(String str){
        System.out.println(str + " String");
    }
}
