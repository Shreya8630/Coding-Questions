class Solution {
    public boolean isPalindrome(int x) {
        String[] arr=String.valueOf(x).split("");
        int start=0;
        int end=arr.length-1;
        
        for(int i=0;i<arr.length/2;i++){
            if ((arr[start]).equals(arr[end])){
                start++;
                end--;

            }
            else{
                return false;
            }
        }
        return true;
        

    }
}