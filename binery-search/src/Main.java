public  class Main {
    static void main(String[] args) {
//        int[] arr = {1,10,23,25,34,45,67,78,85,87,88,98,654};
        int[] arr = {654,100,23,22,21,18,17,13,10,9,5,2,1,-10,-6};
        int target = 100;
        int index = findBinarySearch(arr,target);
        System.out.println(index);
    }

    static int findBinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];
//        System.out.println(isAsc);

        while (start <= end){
            int midIndex = start + (end - start)/2;

            if(arr[midIndex] == target){
                return midIndex;
            }

            if(isAsc){
                if(target > arr[midIndex]){
                    start = midIndex + 1;
                }else{
                    end = midIndex -1;
                }
            } else {
                if(target > arr[midIndex]){
                    end = midIndex -1;

                }else{
                    start = midIndex + 1;
                }
            }
        }
        return -1;
    }
}