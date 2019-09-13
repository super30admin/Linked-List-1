class ReverseLinkedList {
    // Time complexity O(n)
    // Space complexity O(1)
    // Tested in Leetcode
    
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode nloc = head;
        
        while(curr != null){
            nloc = nloc.next;
            curr.next = prev;
            prev = curr;
            curr = nloc;
        }
        return prev;
    }
}