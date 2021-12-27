// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
public class DetectCycle {
    public ListNode detectCycle(ListNode head) {

        // if(head == null) return null;
        // HashSet<ListNode> set = new HashSet<>();
        // while(head.next != null){
        //     if(set.contains(head)) return head;
        //     set.add(head);
        //     head = head.next;
        // }
        // return null;

        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                flag = true;
                break;
            }
        }
        if(!flag) return null;

        fast = head;

        while(fast != slow){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}

