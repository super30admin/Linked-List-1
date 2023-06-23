public class Solution {
    public ListNode detectCycle(ListNode head) {
        //Time Complexity:-O(n)
        //Space Complexity:-O(1)
        //basic condition
        if(head==null) return null;
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                flag = true;
                break;
            }
        }
        if(!flag) return null;
        slow = head;
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }
}