// Time Complexity : O (n) => O(n)
// Space Complexity : O (1) 
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : 

// Your code here along with comments explaining your approach: here to find the node first i took dummy node and started start and fast pointer at dummy node and move it by 1x speed always until it is equal to n.then i shift the window till fast not equal to null then i removed slow.next which is the nth node from last.




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
        ListNode dummy = new ListNode(-1);
        dummy.next=head;
        ListNode slow=dummy;
        ListNode fast=dummy;
        int count=0;
        
        if(head == null){
            return head;
        }
        if(n == 1 && head.next == null ){
            head=null;
            return head;
        }
        while(count <= n){
              fast=fast.next;
            count++;
        }
        while(fast != null){
           slow=slow.next;
            fast=fast.next;
        }
         ListNode temp=slow.next;
         slow.next=slow.next.next;   
         temp=null;
         return dummy.next;
        
    }
}