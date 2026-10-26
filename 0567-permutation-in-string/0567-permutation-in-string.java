class Solution {
    public boolean isSameFreq(int f1[],int f2[]){
        for(int i=0; i<26;i++){
        if(f1[i]!=f2[i]){
            return false;
        }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int freq[] = new int[26];
        if(s1.length() >s2.length()){
            return false;
        }
        for(int i=0; i<s1.length(); i++){
            freq[s1.charAt(i)-'a']++;
        }  
        int win = s1.length();
        for(int i=0; i<s2.length(); i++){
            int ind = i,winInd =0;
            int winFreq[] = new int[26];
            while(winInd < win && ind<s2.length()){
                winFreq[s2.charAt(ind)-'a']++;
                winInd++;
                ind++;
            }
            if(isSameFreq(freq,winFreq)){
                return true;
            }
        }
        return false;
    }
}