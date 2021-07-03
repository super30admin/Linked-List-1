// Time Complexity :O(n) n-number of nodes
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :-
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        boolean flag=false;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                flag=true;
                break;
            }
        }
        if(!flag) return null;
        slow=head;
        while(slow!=fast)
        {
            slow=slow.next;
            fast=fast.next;
        }
        
    
        return slow;
    }
}
/*
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
*/