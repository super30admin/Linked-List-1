public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
            if(s==f){
                break;
            }}
            if(f==null || f.next==null){
                return null;
            }
            ListNode x = head;
            ListNode y = s;
            while(x!=y){
                x=x.next;
                y=y.next;
            }
        return x;
        }
        
    }
//tc=O(n)
//sc =O(1)
