//Tc: o(n)
//Sc : o(1)
//https://leetcode.com/problems/linked-list-cycle-ii/
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return head;
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                flag = true;
                break;
            }
        }
        slow = head;
        if(!flag) return null;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
