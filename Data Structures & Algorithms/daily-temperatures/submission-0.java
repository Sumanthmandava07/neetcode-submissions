class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] arr=new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i]=0;
        }
        Stack<Integer> stack=new Stack();
        for(int i=0;i<n;i++)
        {
            int t=temperatures[i];
            while(!stack.isEmpty())
            {
                int previous=stack.peek();
                int temp=temperatures[previous];
                if(t>temp)
                {
                    stack.pop();
                    arr[previous]=i-previous;
                }
                else
                {
                    break;
                }
            }
            stack.push(i);
        } 
        return arr;
    }
}