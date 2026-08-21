
//Approach: Maintain current, previous and fast pointer and slowly iterate while reassigning the next pointer until the linkedList is reversed.
// Time Complexity: O(n)
// Space Complexity: O(1)
class LinkedListReversal {
    public ListNode reverseList(ListNode head) {

        //Add validations
        if(head == null || head.next == null) return head;

        ListNode prev = null;
        ListNode curr = head;
        ListNode fast = head.next;

        while(fast != null){
            curr.next = prev;
            prev = curr;
            curr = fast;
            fast = fast.next;
        }
        curr.next = prev;
        return curr;
    }
}