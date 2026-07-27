class Solution {
    public int calPoints(String[] operations) {
      Stack<Integer> st=new Stack<>();
      for(int i=0;i<operations.length;i++)
      {
        String ch=operations[i];
        if(ch.equals("+")){
            int top=st.pop();
            int new1=top+st.peek();
            st.push(top);
            st.push(new1);
        }
        else if(ch.equals("D"))
        {
            int top=2*(st.peek());
            st.push(top);
        }
        else if(ch.equals("C"))
        {
            st.pop();
        }
        else
        {
            st.push(Integer.parseInt(ch));
        }
      }
      int sum=0;
      for(int score:st)
      {
        sum=sum+score;
      } 
      return sum; 
    }
}