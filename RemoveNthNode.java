// TC:O(n)
// SC: O(1)
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //created this because of edge case like we have a list of length 6 and we need to remove n=6. which is the first element.
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        int count = 0;

        // keep moving fast until it reaches n nodes away from slow pointer
        while(count <= n) {
            fast = fast.next;
            count++;
        }

       // keep moving them until fast == null. In this case Slow is at n-1 pointer. So, we just do slow.next = slow.next.next which is the next element.
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        // We did 35 and 37 for garbage collection of the removed node. In python, it will garbage colklected by itself but not in JAVA,
        ListNode temp = slow.next; // 35
        slow.next = slow.next.next;
        temp.next = null; //37

        return dummy.next;
        
    }
}