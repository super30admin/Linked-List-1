// Time Complexity : O(N)+O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        // find the first intersection between the fast and slow pointers in a circlular LL
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                flag = true;
                break;
            }
        }
        // if no cycle found, return null
        if(!flag) return null;
        slow = head;
        // else move each pointer simultaneously one step ahead in the circle
        // definitely, there'll be a meeting point
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;

        }
        return slow;
    }
}


// brute force - using hashset Time Complexity O(N) space: O(N)

public class Solution {
    public ListNode detectCycle(ListNode head) {
        //Space O(N)
        Set<ListNode> nodesList = new HashSet<>();
        ListNode curr = head;
        //Time O(N)
        while(curr != null && !nodesList.contains(curr)) {
            nodesList.add(curr);
            curr = curr.next;
        }
        return curr;
    }
}