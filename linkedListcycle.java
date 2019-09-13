//Time Complexity:O(N)
//Space Complexity:O(1)
//In this problem, I'll be moving 2 steps using my fast pointer and 1 step using my slow pointer. I'll keep doing this until my fast and slow pointers meet each other or fast becomes null or next node of fast is null. Then,I'll iterate again until my start and slow meets and then I'll return start.
//This code was executed successfully and got accepted in leetcode.


public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null||head.next==null){
            return null;
        }
        ListNode fast=head;
        ListNode slow=head;
        ListNode start=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                while(slow!=start){
                   
                    start=start.next;
                    slow=slow.next;
                }
                return start;
            }
        }
        return null;
    }
}