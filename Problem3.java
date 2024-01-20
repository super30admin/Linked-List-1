//Accepted on LT
// The idea isto go till we find a node that we repeated already
//Time should be O(n)
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode crr= head;
        int x = 0;
        ListNode no = new ListNode(-1);
        if(crr==null){
            return null;
        }
        if(crr.next==null){
            return null;
            
        }
        while(crr.val!= 123456789){
                x=x+1;
                crr.val = 123456789;
                if(crr.next==null){
                    return null;
            
                }
                crr=crr.next;
        }

        return crr;
    }
}