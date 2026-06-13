/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) 
        {
            return head;
        }
        ListNode temp=head;
        int n=0;
        int count=0;
        while(temp!=null)
        {   
            count++;
            temp=temp.next;
        }
        if(k%count==0)
        {
            return head;
        }
        else
        {
             n= k%count;
        }
        for (int i = 0; i<n; i++) 
        {
            ListNode curr = head;
            ListNode prev = null;
            while (curr.next != null) {
                prev = curr;
                curr = curr.next;
            }

            prev.next = null;
            curr.next = head;
            head = curr;
        }
        return head;
    }
}