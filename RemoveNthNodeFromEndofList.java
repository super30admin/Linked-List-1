// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        int length = 0;
        ListNode temp = head;
        while(temp!=null){
            temp = temp.next;
            length++;
        }
        ListNode prev = null;
        temp = head;
        while(count<length-n){
            prev = temp;
            temp = temp.next;
            count++;
        }
        //System.out.println(prev.val);

        if(prev==null) head=head.next;
        else prev.next = temp.next;
        return head;
    }
}
