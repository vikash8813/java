public class Questions {
    static void main(String[] args) {
        int[] arr = {2,43,53,3434,2,211,4242};


        System.out.println(evenNumbers(arr));
    }

    static int evenNumbers(int[] arr){
      int count = 0;
      for (int elem: arr){
          int digits = digitNumber(elem);
          if(digits % 2 == 0){
              count++;
          }

      }
      return  count;
    };

    static int digitNumber(int num){
        int count = 0;
        int n = num;
        if(n == 0){
            return 1;
        }
        if(n<0){
            n = n * -1;
        }
        while (n > 0){
            n = n/10;
            count++;
        }

        return count;
    }


}
