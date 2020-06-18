// Time Complexity :O(n) n-number of nodes
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :-
public class Solution {
    public ListNode detectCycle(ListNode head) {
       HashSet<ListNode> map=new HashSet<>();
        while(head!=null)
        {
            if(!map.contains(head))
                map.add(head);
            if(map.contains(head.next))
                return head.next;
            head=head.next;

        }
        return null;
    }
}