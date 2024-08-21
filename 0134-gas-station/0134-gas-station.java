class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total=0, remgas = 0, fuelcap =0, index=0;

        for(int i =0; i<gas.length; i++){
            remgas = gas[i] - cost[i];
            total += remgas;
            fuelcap += remgas;
            if(fuelcap < 0){
                index = i+1;
                fuelcap =0;  
            }
        }

        if(total < 0 )
            return -1;
        else
           return index;    
    }
}