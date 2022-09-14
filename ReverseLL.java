public class ReverseLL {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next==null) return head;
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}

// Time Complexity - O(n)
// Space Complexity - O(1)