class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right = s.length()-1;
        while(left<right){
            if(Character.isLetterOrDigit(s.charAt(left))){
                if(Character.isLetterOrDigit(s.charAt(right))){
                    char a = Character.toLowerCase(s.charAt(left));
                    char m = Character.toLowerCase(s.charAt(right));
                    if(a != m){
                        return false;
                    }
                    left++;
                    right--;
                    
                }
                else{
                    right--;
                }
            }
            else{
                left++;
            }
            
        }
        return true;
    }
}