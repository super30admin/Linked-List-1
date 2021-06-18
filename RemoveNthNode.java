
// Time complexity - O(N)
// Space complexity - O(1)

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // put a dummy node to cover the edge case
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0;


        // increment the count and move the fast pointer till counter reaches n

        while(count <= n && fast != null) {

            fast = fast.next;
            count++;

        }


        // after the counter reaches n increment slow and fast pointer; slow pointer will reach to the value before the removal element

        while(fast != null) {

            slow = slow.next;
            fast = fast.next;
            System.out.println(slow.val);

        }

        //remove the element by changing the pointer position to next
        slow.next = slow.next.next;

        return dummy.next;


    }
}