class Solution {
    public int[] sortedSquares(int[] A) {
        
        // the testCase maybe error 
        Arrays.sort(A);
        
        if(A.length==1){
           return new int[]{A[0]*A[0]};   
        }
        int low=0,high=A.length-1;
        int[] result=new int[A.length];
        
        while(low+1<high){
            int mid=((high-low)>>1)+low;
            if(A[mid]==0){
                low=mid;
                high=mid+1;
                break;
            }
            if(A[mid]<0){
                low=mid;
            }else{
                high=mid;
            }
        }
        int index=0;
        while(low>=0 && high<A.length){
            if(0-A[low]<=A[high]){
                result[index++]=A[low]*A[low];
                low--;
            }else{
                result[index++]=A[high]*A[high];
                high++;
            }
        }
        while(low>=0){
             result[index++]=A[low]*A[low];
             low--;
        }
        while(high<A.length){
             result[index++]=A[high]*A[high];
             high++;
        }
        return result;
    }
}
