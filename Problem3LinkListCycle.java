

//1st approach using hashSet using O(N) time;
// and O(N) Space Complexity

public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        HashSet<ListNode> set=new HashSet<>();
        
        ListNode curr=head;
        while(!set.contains(curr) && curr!=null){
            set.add(curr);
            curr=curr.next;
        }
        return curr;
    }
}
