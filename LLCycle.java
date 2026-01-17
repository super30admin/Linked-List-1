/**
 * Problem : https://leetcode.com/problems/linked-list-cycle-ii/
 * Time Complexity : O(n)
 * Space Complexity : O(n)
 * Did this code successfully run on Leetcode : yes
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode curr = head;

        while(curr != null){
            if(set.contains(curr)) return curr;
            set.add(curr);
            curr = curr.next;
        }
        return null;
    }
}
// Time Complexity : O(n)
// Space Complexity : O(1)
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                flag = true;
                break;
            }
        }
        if(!flag) return null;
        fast = head;
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}