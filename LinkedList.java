public class LinkedList {
   // time complextiy : N
   // space complexity : 1
   // did it run on leetcode : yes
   // any doubts : no
   
    public ListNode reverseList(ListNode head) {
        if(head== null || head.next == null){
            return head;
        }
        ListNode newHead=reverseList(head.next);
        head.next.next = head;
        head.next=null;
        return newHead;
        
    }
    //https://leetcode.com/problems/remove-nth-node-from-end-of-list/submissions/
    // time complextiy : N
   // space complexity : 1
   // did it run on leetcode : yes
   // any doubts : no
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null ) return head;
      
        ListNode dummy = new ListNode();
        dummy.next = head;
        
        ListNode fast = dummy;
        ListNode slow = dummy;
        int count = n;
        while(count >=0){
            fast = fast.next;
            count--;
        }
        while(fast != null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
        
    }
  //  https://leetcode.com/problems/linked-list-cycle-ii/
  // time complexity : N
  // space complexity : 1
  // did it run on leetcode : yes
  // any doubts : no

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast= fast.next.next;
            slow = slow.next.next;
            if(fast == slow){
                ListNode slow2 = head;
                while(slow2 != slow){
                    slow2= slow2.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }
}
