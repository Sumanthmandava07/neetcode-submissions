class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int result=0;
        while(left<right)
        {
            // int area=Math.min(heights[left],heights[right]*(right-left));
            int area = Math.min(heights[left], heights[right]) * (right - left);
            result=Math.max(result,area);
            if(heights[left]<=heights[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return result;
    }
}

// class Solution
// {
//     public int maxArea(int[] height)
//     {
//         int n=height.length;
//         int maxwater=0;
//         int left=0;
//         int right=n-1;
//         while(left<=right)
//         {
//             int width=right-left;
//             int h=Math.min(height[left],height  [right]);
//             int area=width*h;
//             maxwater=Math.max(maxwater,area);
//             if(height[left]<height[right])
//             {
//                 left++;
//             }
//             else
//                 right--;
//         }
//         return maxwater;
//     }
// }
