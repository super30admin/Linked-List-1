// Time Complexity O(N)
// Space Complexity O(N)
// Approach if we find the node in hashset, thats the start of the cycle
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> hs = new HashSet<>();
        while(head!=null){
            if(hs.contains(head)){
                return true;
            }
            hs.add(head);
            head = head.next;
        }
        return false;
    }
}