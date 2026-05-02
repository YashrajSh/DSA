class Solution {
    public int countSubstrings(String s) {
        int res =0;
        for( int i = 0 ; i<s.length();i++){
            res+=expandfrommid(s,i,i);
            res+= expandfrommid(s,i,i+1);
        }
        return res;
        

    }
    public int expandfrommid(String s , int i , int j){
        int c = 0;
        while(i>=0 && j<s.length() && (s.charAt(i)==s.charAt(j))){
            c+=1;
            i-=1;
            j+=1;
        }
        return c;
    }
}