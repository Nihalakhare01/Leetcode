class Solution {
    public int longestConsecutive(int[] nums) {

    HashMap<Integer, Boolean> map = new HashMap<>();

    for(int num : nums)
        map.put(num, Boolean.FALSE);


    int longlen=0;

      for(int num : nums){
        int curlen = 1;

        int nextnum = num + 1;

        while(map.containsKey(nextnum) && map.get(nextnum) == false){
            curlen++;
            map.put(nextnum, Boolean.TRUE);   
            nextnum++;
        }

        int prevnum = num - 1;

        while(map.containsKey(prevnum) && !map.get(prevnum)){
            curlen++;
            map.put(prevnum, Boolean.TRUE);   
            prevnum--;
        }

        longlen = Math.max(longlen, curlen);
    }

        return longlen;
    }
}