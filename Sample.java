import java.util.*;

// Problem1
//Time Complexity :O(n)
// Space Complexity :O(1)
class Solution1 {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        
        // 3 pointer,
        // current at head;
        //n at head.next
        //previous at null
        ListNode current = head;
        ListNode n = head.next;
        ListNode previous = null;
        
        //
        while(current != null){
            //1->2->3->4
            //1st iteration
            //n becomes current.next(i.e) = 2
            n = current.next;

            //head==1 i.e (current.next) points to previous i.e = null
            current.next = previous;

            //previous points at current i.e = 1 (head)
            previous = current;

            //current moves left and points at n i.e = 2
            current = n;
        }
        
        return previous;
    }
}
// Problem2
//Time Complexity :O(n/2)
// Space Complexity :O(1)

class Solution2 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null)
            return head;

        //dummy node pointing to the head
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
        //two pointers
        ListNode start = dummy, end = dummy;
        
        //2nd pointer pointing at the nth node
        for(int i= 0; i<=n; i++){
            end = end.next;
        }

        //increase both the pointers till 2nd pointer is at the end
        while(end != null){
            start = start.next;
            end = end.next;
        }//at this point the 1st pointer will point 
        //at the element before thone that needs to be deleted
        
        start.next = start.next.next;//delete the link from the 1st pointer to the next element
        
        return dummy.next;
    }
}

// Problem3
//Time Complexity :O(n)
// Space Complexity :O(1)


class Solution3 {
    public ListNode detectCycle(ListNode head) {
        if(head == null)
            return head;

        //boolean variable to store the result if the list has cycle or not
        boolean hasCycle = false;

        //two pointers
        ListNode slow = head, fast = head;

        //while the fast pointer does not reach the end of the list
        while(fast != null && fast.next != null){
            //move slow by 1 node
            slow = slow.next;

            //move fast by 2 nodes
            fast = fast.next.next;

            //if both the pointers become equla
            //list has a cycle
            if(slow == fast){
                hasCycle = true;
                break;
            }
        }

        //else it does not
        if(!hasCycle){
            return null;
        }

        //now move 1 of the pointers to the head
        slow = head;

        //then move both of them at the same pace(by 1 node)
        //wherever they meet is the start of the cycle
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }

        //return either of the pointers
        //because they are at the same node
        return slow;
    }
}