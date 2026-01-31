import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTut {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        ArrayList<Integer> list = new ArrayList<>(10);
//
//        for (int i = 0; i <5 ; i++) {
//            list.add(in.nextInt());
//        }
//
//        System.out.println(list);
//        list.set(1,100);
//        System.out.println(list);
//        list.remove(4);
//        System.out.println(list);


        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i <3 ; i++) {
            list.add(new ArrayList<Integer>());
        }

        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                list.get(i).add(in.nextInt());
            }
        }

        System.out.println(list);
    }
}
