public class shadowing {
    static int x= 10;
    static void main(String[] args) {
        System.out.println(x);
        int x;
//        System.out.println(x);
        x =20;
        System.out.println(x);
        print();
    }

    static void print(){
        System.out.println(x);
    }
}
