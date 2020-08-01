/* Time complexity: O(n)
space complexity: O(1)
*/

class Solution{
    public ListNode removeNthElement(ListNode head, int n){
        ListNode dummy = new ListNode(0);
        ListNode slow = dummy; ListNode fast = dummy;
        dummy.next = head; int count = 0;
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