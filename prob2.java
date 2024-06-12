

// Time Complexity :O(n) as we traverse LL in one pass, first create appropriate gap between slow and fast, 
// then till fast is not null, increment slow to reach correct node, 
// i.e node previous to the node to be deleted
// Space Complexity : O (1) no extra space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : yes, forgot to increment count 


class Solution {
    public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;
        ListNode dummy = new ListNode(-1, head);
        int count = 0;
        ListNode slow = dummy; 
        ListNode fast = dummy; 
        while(count <= n){
            fast = fast.next;
            count++;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
        
    }
    public static void main(String[] args) {

        
    }
} 