/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Problem3 {
    public ListNode detectCycle(ListNode head) {
        // null check
        if(head == null) return null;
        boolean cycleCheck = false;
        ListNode slow = head;
        ListNode fast = head;
        int index = 0;
        // Initial check for slow and fast to meet somewhere
        while(fast!=null && fast.next != null){ //check should be for even and odd no. of nodes in the LL.
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cycleCheck = true;
                break;
            }
        }
        // if a cycle was detected from previous loop we start searching for the start index
        if(cycleCheck){
            slow = head;
            while(slow != fast){
                slow = slow.next;
                fast = fast.next;
                index++;
            }
            System.out.println("tail connects to node index " + index);
            return slow;

        }
        else{
            System.out.println("no cycle");
            return null;
        }

    }
}
// TC: O(N)
// SC: O(1)