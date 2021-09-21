// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
public class reverse{
public ListNode reverseList(ListNode head) {
    if(head==null || head.next==null)return head;
    
    ListNode reversed =reverseList(head.next);
    head.next.next=head;
    head.next=null;
    return reversed;
    }
}