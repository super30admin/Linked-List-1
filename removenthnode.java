/**Time Complexity :
    O(n)
// Space Complexity :
    O(1)
// Did this code successfully run on Leetcode :
     Accepted
// Any problem you faced while coding this :   
    NO
// Your code here along with comments explaining your approach**/


class removenthnode{
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || n==0) return head;
        //dummy node for the start
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode slow=dummy;
        ListNode fast=dummy;
        int count=0;
        while(count<=n){
            count++;
            fast=fast.next;
        }
        //to reset
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return dummy.next;
        
    }
}