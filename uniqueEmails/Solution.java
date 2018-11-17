class Solution {
    public int numUniqueEmails(String[] emails) {
        
        if(emails.length==0) return 0;
        Set<String> uniqueAddrs = new HashSet<String>();
        
        for(int i=0;i<emails.length;i++){
            String[] names = emails[i].split("@");
            names[0] = names[0].replaceAll(".","");
            String[] custnames = names[0].split("\\+");
            
            String finalEmail = custnames[0]+names[1];
            if(!uniqueAddrs.contains(finalEmail)){
                uniqueAddrs.add(finalEmail);
            }
            
        }
        
        return uniqueAddrs.size();
    }
}
