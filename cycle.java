/* Time complexity: O(n)
Space complexity: O(1)
*/

class Solution{
    public ListNode detectCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;

        while(fast != null && fast.next != null){
            if(slow == fast){
                flag = true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        if(!flag) return null;
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }

        return fast;
    }
}