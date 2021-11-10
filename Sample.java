//Space Complexity: O(1);
//Time Complexity : O(N) + O(z) depends on the number of cycles
//Did it run on leetcode :  YES
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow){
                ListNode dummy = head;
                while(dummy!=slow){
                    slow = slow.next;
                    dummy = dummy.next;
                }
                return slow;
            }
        }
        return null;

    }
}