import java.util.HashSet;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Solution2 {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode, Integer> map = new HashSet();
        ListNode temp = head;
        int idx =0;
        while(temp!=null){
            if(map.containsKey(temp))
                return map.get(temp);
            else{
                map.put(temp,idx++);
                temp = temp.next;
            }
        }
         return map.get(temp);
    }
}
public class DetectCycle {

}
