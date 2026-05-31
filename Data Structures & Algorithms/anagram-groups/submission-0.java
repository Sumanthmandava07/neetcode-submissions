class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> res=new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            int count[]=new int[26];
            String s=strs[i];
            for(int j=0;j<strs[i].length();j++)
            {
                char c = s.charAt(j);
                count[c - 'a']++;
            }
            String key =Arrays.toString(count);
            List<String> list =res.get(key);
            if(list==null)
            {
                list = new ArrayList<>();
                res.put(key, list);
            }
            list.add(s);
        }
       return new ArrayList<>(res.values());   
    }
}
