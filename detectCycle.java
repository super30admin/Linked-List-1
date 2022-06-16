// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

public class detectCycle {
        public ListNode detectCycleInList(ListNode head) {
            if(head == null || head.next == null){
                return null;
            }
            ListNode slow = head;
            ListNode fast = head;
            while(fast!= null && fast.next!= null){
                slow = slow.next;
                fast = fast.next.next;
                if(slow == fast){
                    break;
                }
            }
            if(fast== null || fast.next==null) return null;
            slow = head;
            while(slow!= fast){
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
        public static class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }
    
    
}
