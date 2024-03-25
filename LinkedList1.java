//reverse linked list #49
//Time complexity O(N)

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode temp = null;
        while(curr!=null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}

//#50 nth node from the end of the lsit
//Time complexity O(N) and space complexity O(1)
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode first = dummy;
        ListNode second = dummy;
        int count =0;
        while(count<=n){
            first = first.next;
            count++;
        }

        while(first!=null){
            first=first.next;
            second=second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }
}

//#51 linked list cycle 2
//time complexity O(N) and space complexity O(1)
public class Solution {
    public ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast = fast.next.next;

            if(slow==fast){
                break;
            }
        }
        

        if(fast==null || fast.next==null){
            return null;
        }

        fast=head;

        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }

        return slow;

    }
}
