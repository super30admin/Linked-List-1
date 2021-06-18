//time complexity: O(n)
//space complexity:O(1) 
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        while(head!=null)
        {
            //[1,2,3]
            ListNode next_node=head.next;
            head.next=prev;//changing the references from 3 to 2 to 1
            prev=head;
            head=next_node;
        }
        return prev;
    }
}
