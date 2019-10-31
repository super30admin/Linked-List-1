//Time Complexity :O(N)
//Space Complexity :O(1)
//Did this code successfully run on Leetcode :yes
//Any problem you faced while coding this :Nope


//Your code here along with comments explaining your approach
public class DetectCycle {
    public ListNode detectCycle(ListNode head) {
        if(null == head || null == head.next){return null;}
        ListNode slow = head, fast = head;
        boolean isStart = true;
        while(isStart || (null != fast && null != fast.next && fast != slow)){
            if(isStart){isStart = false;}
            slow = slow.next;
            fast = fast.next.next;
        }
        if(null == fast || null == fast.next){return null;}
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
    return fast;
    }
}