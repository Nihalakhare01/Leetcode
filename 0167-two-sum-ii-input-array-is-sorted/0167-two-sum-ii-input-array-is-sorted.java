class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int diff = 0;

        for(int i=0; i<numbers.length; i++){
            diff = target - numbers[i];
            if(map.containsKey(diff))
                return new int[]{map.get(diff)+1, i+1};
            map.put(numbers[i], i);
        }
        return new int[]{};
         
    }
}