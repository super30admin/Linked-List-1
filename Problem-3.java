// Time Complexity : O(N) 
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        
        ListNode temp=head;
        
        while(temp!=null){
            if(!set.contains(temp))
                set.add(temp);
            else{
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
}