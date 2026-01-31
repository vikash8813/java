public class scopes {

    static void main(String[] args) {
        int a = 10;

        {
            a =100;
            System.out.println(a);
            int b = 20;
        }

        System.out.println(a);
//        System.out.println(b);

        for (int i = 0; i < 10; i++) {
//         int a =20;
            int c =100;

        }
    }

    static void sum(){
        int num1= 100;
    }
}
