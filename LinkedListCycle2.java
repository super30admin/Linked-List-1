//Time complexity is O(N)
//Space complexity is O(N)
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> hm = new HashSet<ListNode>();
        while(head!=null){
            if(hm.contains(head)){
                return head;
            }
            else{
                hm.add(head);
            }
            head=head.next;
        }
        return null;
    }
}