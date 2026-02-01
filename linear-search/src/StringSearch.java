public class StringSearch {
    static void main(String[] args) {
        String name = "vikash";
//        System.out.println(stringSearch(name,'s'));
//        System.out.println(stringSearch2(name,'j'));

        int[] arr = {1,34,345,34,23,53,4,23,233};
        System.out.println(max(arr));
    }

    static int stringSearch(String str, int target){
        if(str.isEmpty()){
            return -1;
        }
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i) == target){
                return i;
            }
        }
        return -1;
    }


    static boolean stringSearch2(String str, int target){
        if(str.isEmpty()){
            return false;
        }
        for (char c: str.toCharArray()) {
            if(c == target){
                return true;
            }
        }
        return false;
    }


    static int max(int[] arr){
        int max = Integer.MIN_VALUE;

        for(int elem: arr){
            if(elem > max){
                max = elem;
            }
        }
        return max;
    }

}
