class Solution {
    public int candy(int[] ratings) {
        
        int count =1, ans =0, n = ratings.length;
        int arr[] = new int[n];
        Arrays.fill(arr, 1);

        for(int i=1; i<n; i++){
            if(ratings[i] > ratings[i-1])
                arr[i] = arr[i-1]+1;
        } 

          for(int i=n-1; i>0; i--){
            if(ratings[i-1] > ratings[i] && arr[i-1] <= arr[i])
                arr[i-1] = arr[i]+1;
        }

        return Arrays.stream(arr).sum();

    }
}