//time complexity:O(n)
//space complexity:O(1)
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        boolean flag=false;
        while (fast!=null &&fast.next!=null)
        {
            slow=slow.next;//increment slow in steps of 1
            fast=fast.next.next;//increment dast in steps of 2
            if(fast==slow)
            {
                flag=true;//when they meet turn flag true
                break;
            }
            
        }
        if(!flag) return null;//if there is no cycle return null
        fast=head;//else reset one pointer
        while(slow!=fast){
            slow=slow.next;//increment both pointers untill they meet
            fast=fast.next;
        }
        return fast;
    }
}
