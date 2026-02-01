public class MaxWealth {
    static void main(String[] args) {
        int[][] persons = {
                {1,2,4},
                {2,4,6},
                {2,4,6,20},
        };

        System.out.println(maxWealthAmount(persons));
    }

    static int maxWealthAmount(int[][] accounts){
        int maxVal = Integer.MIN_VALUE;
        for (int[] person: accounts){
            int totalWealth = 0;
            for (int account: person){
                totalWealth = totalWealth + account;
            }
            if(totalWealth > maxVal){
                maxVal = totalWealth;
            }
        }
        return maxVal;
    }
}
