//Time Complexity : O(n)
//Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Your code here along with comments explaining your approach
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return head;
        }
        //use a dummy node previous to head
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        //initially the slow and fast pointers are pointing at dummy node
        ListNode slow = dummy,fast = dummy;
        int count=0;
        //until the count is less than or equal to n, move the fast pointer
        while(count<=n){
            fast = fast.next;
            count++;
        }
        //once count is greater than n, start moving both the pointers until the fast reaches the end of the list
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        //at this point slow will be pointing to the node previous to the nth node to be deleted
        slow.next = slow.next.next;
        return dummy.next;
    }
}