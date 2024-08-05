// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YEs
// Any problem you faced while coding this : No

public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> hs = new HashSet<>();
        int count = 0;
        ListNode temp = head;
        while(temp!=null){
            if(temp.next!=null && hs.contains(temp.next)){
                return temp.next;
            }
            hs.add(temp);
            temp=temp.next;
        }
        return null;
    }
}
