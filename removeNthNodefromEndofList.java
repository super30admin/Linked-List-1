// Space complexity - O(1)
// Space complexity - O(n)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No


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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        
        if(head == null || head.next == null){return null;}
        ListNode temp = new ListNode(-1);
        temp.next = head;
        ListNode slow = temp;
        ListNode fast = temp;
        boolean flag = false;
        int count = 0;
        
        while(count < n ){
          // System.out.println(fast.val);
            fast = fast.next;
            count ++;
            
        }
        
        while(fast.next != null ){
          //  System.out.println("fast is "+fast.val);
          //  System.out.println("slow is " +slow.val);
            slow = slow.next;
            fast = fast.next;
          //   System.out.println("fast is "+fast.val);
          //  System.out.println("slow is " +slow.val);
        }
        //System.out.println(slow.val);
        slow.next = slow.next.next;
        
        return temp.next;
        
    }
}