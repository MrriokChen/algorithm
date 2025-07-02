import java.util.Arrays;

public class MaxProfit {
    public int maxProfit(int[] prices) {
        if(prices.length <= 1) return 0;
        int minPlace = -1, maxPlace = -1, max = 0, sum = 0;

        for(int i = 0; i < prices.length; i++) {
            if (minPlace == -1 && maxPlace == -1) {
                for(int j = i+1; j < prices.length; j ++) {
                    if(prices[j] > prices[i] && max < prices[j] - prices[i]) {
                        maxPlace = j;
                        minPlace = i;
                        max = prices[j] - prices[i];
                    }
                }
            } else if (maxPlace != -1 && i > maxPlace) {
                for(int j = i+1; j < prices.length; j++) {
                    if(max < prices[j] - prices[i]) {
                        maxPlace = j;
                        minPlace = i;
                        max = prices[j] - prices[i];
                    }
                }
            } else if (minPlace != -1 && i < maxPlace && prices[i] < prices[minPlace]) {
                minPlace = i;
                max = prices[maxPlace] - prices[minPlace];
            }
        }
        return max;
    }

    public int fib(int n) {
        int []feibo = new int[105];
        if(n <= 1) return n;
        for(int i = 0; i < n; i++) {
            if(i <= 1){
                feibo[i] = i;
            } else{
                feibo[i] = feibo[i-1] + feibo[i-2];
            }
        }

        return feibo[n];
    }

    public static void main(String[] args) {
        MaxProfit maxProfit = new MaxProfit();
//        System.out.println(maxProfit.maxProfit(new int[]{4,2,7,1}));
        System.out.println(maxProfit.fib(3));
    }
}
