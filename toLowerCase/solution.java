class Solution {
    public String toLowerCase(String str) {
        
        String upperCaseString = "";
        
    
        for(int i=0;i <str.length();i++){
        
            if(str.charAt(i)-'A' < 25 && str.charAt(i) - 'A' >= 0) upperCaseString += (char) (str.charAt(i) + 32);
            else upperCaseString += str.charAt(i);
        }        
        
        return upperCaseString;
    }
}
