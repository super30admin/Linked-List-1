// Time Complexity : O(n), n would be the number of nodes in the linkedlist 
// Space Complexity : O(n), since straight forwardly keeping track of all seen nodes
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : Can't come up with a logic for a solution which would O(1) space
// I tried to think of traversing the linkedlist and see the repeating pattern in the values
// but finding index through that seems complicated as would need to identify the repeating pattern first    

// Your code here along with comments explaining your approach
// the approach is straightforward, traverse the list put nodes in hashmap
// when we encounter a node which is already seen then break and return
// For this approach I tried to put in node.val first, but its not guaranteed to be unique
// so hence had to store entire node in hashmap

public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashMap <ListNode, Integer> idx_map = new HashMap <ListNode, Integer>();
        
        ListNode cur = head;
        int counter = 0;
        
        while(cur!=null && !idx_map.containsKey(cur)){
            idx_map.put(cur, counter);
            counter++;
            cur = cur.next;
        }
        
        return cur;
    }
}