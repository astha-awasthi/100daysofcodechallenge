class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int seconds = 0;
        for(int i = 0; i < tickets.length; i++){
            if(tickets[i] < tickets[k]) seconds += tickets[i]; // only add the time needed to buy his tickets
            else{
                if(i <= k) seconds += tickets[k]; 
                else seconds += tickets[k] - 1; 
            }
        }
        return seconds;
    }
}
