Ran in Leet code- Yes
Time Complexity-o(n)
Space Complexity- constant

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode sp= head;
        ListNode fp= head;
        while(fp!=null && fp.next!=null){
            sp=sp.next;
            fp=fp.next.next;
            if(sp==fp) break;
        }
        if(fp==null || fp.next==null)  return null;
        sp=head;
        while(sp!=fp){
            sp=sp.next;
            fp=fp.next;
        }
        return sp;
    }
}
