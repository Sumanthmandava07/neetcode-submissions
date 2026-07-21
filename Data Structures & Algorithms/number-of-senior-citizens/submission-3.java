class Solution {
    public int countSeniors(String[] details) {
        int n=details.length;
        int result=0;
        for(int i=0;i<n;i++)
        {
            String s=details[i];
            String age=s.substring(11,13);
            int age1=Integer.parseInt(age);
            if(age1>60)
            {
                result++;
            }
        }
        return result;
    }
}