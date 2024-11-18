//19. Remove Nth node from end of list - https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
//Time Complexity: O(n)
//Space Complexity: O(1)

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null)
            return null;
        //to handle edge case
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0;
        //to get n elements in between slow and fast
        while(count <= n){
            fast = fast.next;
            count++;
        }
        //iterate both pointers one by one
        //to find the element to be deleted by slow
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        //delete node
        slow.next = slow.next.next;
        //return head
        return dummy.next;

    }
}
