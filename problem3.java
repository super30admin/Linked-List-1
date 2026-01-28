/**
Time complexity = O(N);
Space Complexity= O(1);
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : 
Initially fast pointer went out of bounds while checking the while condition but later fixed it by modifying it .
Struggled to comeup with the logic to find the head node of cycle.

*/
public class problem3 {
    public ListNode detectCycle(ListNode head) {
        
        ListNode slow=head;
        ListNode fast=head;
        boolean flag=false;
        while(fast!=null && fast.next!=null){
            //slow moves by 1x speed.
            //fast moves by 2x speed.
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){//if both fast and slow meets then there is cycle
                flag=true;
                break;
            }

        }
        if(flag==false){//if not then no cycle
            return null;
        }
        fast=head;
        while(slow!=fast){//after cycle is found moving 1x each until both thre pointers meet and return any node in the end.
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}