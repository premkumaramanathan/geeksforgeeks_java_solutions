class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max =-1;
        int smax=-1;
        for(int i=0;i<arr.length;i++){
            
            if(max < arr[i]){
             
                smax=max;
                max=arr[i];
                
            }
            else if(arr[i]>smax && max!=arr[i]){
                smax=arr[i];
            }
        }
        return smax;
    }
}
