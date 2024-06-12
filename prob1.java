// Time Complexity : O (2n) -> O(n) as we traverse LL to detect cycle and in 2nd pass, we find start of the cycle
// Space Complexity : O (1) no extra space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : no 

class Solution{
    class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode detectCycle(ListNode head){
        if(head == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                flag = true;
                break;
            }
        }
        if(!flag) return null;
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;

    }

    public static void main(String[] args) {

        
    }
}