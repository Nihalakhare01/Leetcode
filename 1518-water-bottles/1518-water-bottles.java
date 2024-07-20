class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int no = numBottles;
        int drinked_bottles = numBottles;
        
        while(no != 0){
            drinked_bottles += (no / numExchange);
            int d = no % numExchange;
            no = no / numExchange;
            if(no == 0){
                break;
            }   
            no += d;
        }
        return drinked_bottles;
    }
} 