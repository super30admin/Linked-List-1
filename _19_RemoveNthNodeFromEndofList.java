class Solution {

  // space complexity - o(1)
      //time - o(n) where n is length of linked list
      //Ran on Leetcode successfully : Yes
      // Problem faced  : No
// Iterative approach : two fast and slow pointer, when fast move to n+1 , start slow
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;
        int count  = 0;

        while(fast != null){
            if(count >= n+1){
                slow = slow.next;
            }
            count++;
            fast = fast.next;;
        }

        if(slow != null && slow.next != null){
            slow.next = slow.next.next;
        }
        return dummy.next;
    }
}
