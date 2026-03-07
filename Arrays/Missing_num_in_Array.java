class Solution {
    long missingNum(int arr[]) {
        // code here
        long n=arr.length;
        long sum=0;
        
    for(int i=0;i<n;i++){
        sum=sum+arr[i];
        
    }
   long totsum= (n+1) * (n+2)/2;
    long val = totsum-sum;
    
   return val;
    }
}
