// Time Complexity : O(n)
// Space Complexity : (n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
// 
public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> visited = new HashSet<>();
        
        while(head != null){
            if(visited.contains(head)){
                return head;
            }
            visited.add(head);
            head = head.next;
        }
        return null;
    }
        
}