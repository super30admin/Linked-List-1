/*O(N) - SC, O(N) - TC
 * Add theeleemnt to the set if not already present, else, there is a cycle
 * */

public class Solution {
    public boolean hasCycle(ListNode head) {

        Set<ListNode> set = new HashSet<ListNode>();
        while(head!= null){
            if (set.contains(head)) return true;
            set.add(head);
            head = head.next;
        }
        return false;
    }
}
