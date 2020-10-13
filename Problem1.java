// Time Complexity : O(n)
// Space Complexity : O(1) - no extra space is used
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : yes, some confusion with updating pointers


// Your code here along with comments explaining your approach

class Solution {

    /** We use two pointers p1 and p2, and temp to store intermediate node
    Do not forget to set original head to null at the end of loop
    **/
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp;
        ListNode p1 = head;
        ListNode p2 = head.next;
        
        while(p2!=null){
            temp = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = temp;
            
        }
        head.next=null;
        return p1;
    }
}