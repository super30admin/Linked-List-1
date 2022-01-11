// Time Complexity : o(n) i am iterating through each node
// Space Complexity : o(n) i will insert each node to set 
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach



public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        
        Set<ListNode> set = new HashSet<ListNode>();
        
        ListNode dummy = head;
        
        while(dummy != null){
            
            if(set.contains(dummy))
                return dummy;
            set.add(dummy);
            dummy = dummy.next;
            
        }
        
        return null;
        
        
        
    }
}