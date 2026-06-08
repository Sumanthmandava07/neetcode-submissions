class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlength=0;
        for(int i=0;i<s.length();i++)
        {
            boolean[] visited=new boolean[256];
            int currentlength=0;
            for(int j=i;j<s.length();j++)
            {
                char ch=s.charAt(j);
                if(visited[ch])
                {
                    break;
                }
                currentlength++;
                visited[ch]=true;
                if(currentlength>maxlength)
                {
                    maxlength=currentlength;
                }
            }
        }
        return maxlength;
        
    }
}
