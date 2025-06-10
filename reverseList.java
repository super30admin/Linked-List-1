//keep three pointers, previous, current and temp to traverse. Change the node pointers 
//Time complexity: O(n)
//Space complexity: O(1)
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode temp=head;
        ListNode front=null;
        ListNode prev=null;

        while(temp!=null)
        {
            front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
            
        }

        return prev;
    }
}