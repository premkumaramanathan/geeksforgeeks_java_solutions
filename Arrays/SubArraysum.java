
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer>res=new ArrayList<>();
        
        int currsum=0;
        
        int start =0;
        
       for(int end = 0; end < arr.length; end++ ){
           currsum +=arr[end];
           
           while(currsum > target && start<end){
               
               currsum-=arr[start];
               start++;
            
           }
           if(currsum==target){
               res.add(start+1);
               res.add(end+1);
               return res;
              
           }
       }
        
        res.add(-1);
        return res;
    }
}
