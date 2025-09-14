public class L3_FractionalKnapsack {

// Ques-3-) GFG Fractional Knapsack

//  SOLUTION BY SELF   
//  T.C. = O(n²)

/*
class Solution {
    int maxi(double[] arr) {
        double max = -Double.MAX_VALUE;
        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                idx = i;
            }
        }
        return idx;
    }
    double fractionalKnapsack(List<Integer> val, List<Integer> wt, int c) {
        int[] v = val.stream().mapToInt(i -> i).toArray();
        int[] w = wt.stream().mapToInt(i -> i).toArray();
        double[] arr = new double[w.length];
        for (int i = 0; i < w.length; i++) {
            arr[i] = (double) v[i] / w[i];
        }
        double ans = 0.0;
        int sumW=0;
        int sumV=0;
        for(int i=0;i<w.length;i++){
            sumW += w[i];
            sumV += v[i];
        }
        if(sumW<=c) return sumV;
        while (c > 0) {
            int i = maxi(arr);
            if (i == -1) break;
            if (w[i] <= c) {
                ans += v[i];
                arr[i] = 0;
                c -= w[i];
            } else {
                ans += arr[i] * c;
                c = 0;
            }
        }
        return ans;
    }
}
*/


// OPTIMIZED

/*
class Solution {
static class Item {
        int value, weight;
        double ratio;
        Item(int value, int weight) {
            this.value = value;
            this.weight = weight;
            this.ratio = (double) value / weight;
        }
    }
    double fractionalKnapsack(List<Integer> val, List<Integer> wt, int c) {
        int n = val.size();
        Item[] items = new Item[n];
        for (int i = 0; i < n; i++) {
            items[i] = new Item(val.get(i), wt.get(i));
        }
        Arrays.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio));
        double ans = 0.0;
        for (Item item : items) {
            if (item.weight <= c) {
                ans += item.value;
                c -= item.weight;
            } else {
                ans += item.ratio * c;
                break;
            }
        }
        return ans;
    }
}
*/

}
