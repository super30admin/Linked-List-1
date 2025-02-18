class Solution {
    //Time Complexity = O(n)
    //Space Complexity = O(1)
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode next = null;
        ListNode curr = head;

        while(curr != null){
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;

        }

        return prev;
    }
}