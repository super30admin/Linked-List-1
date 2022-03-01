// Time Complexity :o(n) n=number of elements
// Space Complexity :o(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
//Start two pointers from dummy node pointing to head. move fast //pointer untill n+1 and another by 1 to maintain distance of n //nodes between two pointers. Once second pointer reaches null, //delete next node to first pointer.

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode();
        dummyHead.next=head;
        ListNode fast=dummyHead;
        int i=1;
        while(i<n+1){
            fast=fast.next;
            i++;
        }
        ListNode slow=dummyHead;
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return dummyHead.next;
    }
}