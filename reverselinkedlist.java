/*
Time Complexity: O(N)
Space Complexity: O(1)
*/
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode previous=null;
        ListNode current=head;
        while(current!=null){
            ListNode temp=current.next;
            current.next=previous;
            previous=current;
            current=temp;
        }
        return previous;
    }
}