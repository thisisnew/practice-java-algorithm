package leetcode;

public class RichestCustomerWealth {
    public static void main(String[] args) {

    }

    public int maximumWealth(int[][] accounts) {

        var max = 0;

        for(var account : accounts){

            var sum = 0;
            for(var wealth : account){
                sum += wealth;
            }

            if (sum > max){
                max = sum;
            }
        }

        return max;
    }
}
