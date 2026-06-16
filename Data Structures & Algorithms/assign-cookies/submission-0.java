class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);
        int i=0,j=0;
        while(i<g.length)
        {
            while(j<s.length&&g[i]>s[j])
            {
                j++;
            }
            if(j==s.length)
            {
                break;
            }
            i++;
            j++;
        }
        return i;
    }
}