class Solution {
    public int numJewelsInStones(String J, String S) {
        
        int res = 0;
        Set<Character> charSet = new HashSet<Character>();
        
        for(int i=0;i<J.length();i++){
            if(charSet.add(J.charAt(i)));
        }
        
        for(int i=0;i<S.length();i++){
            if(charSet.contains(S.charAt(i))) res++;
        }
        
        return res;
        
    }
}
