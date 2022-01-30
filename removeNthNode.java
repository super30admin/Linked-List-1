//Time Complexity: O(N)
//Space Complexity: O(1)


class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        //using a fast and a slow pointer. The slow pointer will start when the fast counter reaches n which help create a sliding window
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0;
        //looping till our fast pointer reaches n
        while(count < n){
            fast = fast.next;
            count++;
        }
        //starting the slow pointer and moving till our fast pointer reaches the last index. This will help us to find the position of
        //the element that needs to be removed and also the size of the list.
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        //removing the element from the list
        slow.next = slow.next.next;
        
        return dummy.next;
    }
}