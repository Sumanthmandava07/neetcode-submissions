class Solution {
    public int lengthOfLastWord(String s) {
        int n=s.length();
        int r=n-1;
        int count=0;
        for(int i=r;i>=0;i--)
        {
            if(s.charAt(i)==' ')
            {
                if(count>0)
                {
                return count;
                }
            }
            else
            {
                count++;
            }
        }
        return count;
    }

}