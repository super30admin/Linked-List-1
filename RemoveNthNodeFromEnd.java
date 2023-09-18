class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0;

        while(count <= n){
            fast = fast.next;
             count++;
        }

        while(fast != null){
            slow = slow.next;
            fast = fast.next;

        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}




/**
TC : O(n)

Sc : O(1)


Description : 

Use 2 pointers (slow, fast) and create a gap of n nodes between slow pointer and fast pointer. So that when fast reaches null we can change the slow reference. 

Edge Case : If we want to remove the first node we can't, so adding a dummy node before the starting node. 

TC : O(n), Sc : O(1)





 */