class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> count=new HashMap<>();
        int result=0;
        for (int i = 0; i < s.length(); i++) 
        {
            char c = s.charAt(i);
            count.put(c,count.getOrDefault(c,0)+1);
            if(count.get(c)%2==0)
            {
                result=result+2;
            }
       }
       for(int cnt:count.values())
       {
        if(cnt%2==1)
        {
            result=result+1;
            break;
        }
       }
       return result;
    }
}