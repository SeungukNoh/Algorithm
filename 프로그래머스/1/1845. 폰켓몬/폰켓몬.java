import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int myPoket = nums.length/2;
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
        }
        
        int type = hm.size();
        
        if(type<=myPoket){
            answer = type;
            
        }else{
            answer = myPoket;
        }
        
        return answer;
    }
}