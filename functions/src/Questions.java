import java.util.Scanner;

public class Questions {

    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter number:");
//        int num = in.nextInt();
//        boolean result = isPrime(num);
//        boolean result = isArmStrong(num);
//        System.out.println(result);
        for (int i = 0; i < 1000 ; i++) {
            boolean res = isArmStrong(i);
            if(res){
                System.out.println(i);
            }
        }
    }


    static boolean isArmStrong(int num){
        int n = num;
        int sum = 0;

        while (n > 0){
            int rem = n % 10;
            sum = sum + rem * rem * rem;
            n = n/10;
        }
        return sum == num;
    };

    static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }

        int c = 2;
        while (c * c <= num){
            if(num % 2 == 0){
                return  false;
            }
            c++;
        }
        return c * c >= num;
    }
}
