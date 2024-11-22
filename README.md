# Linked-List-1

## Problem1 (https://leetcode.com/problems/reverse-linked-list/)
## Time complexity:O(n) SPace Complexity:O(1)
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr=head;
        ListNode prev=null;
        
        while(curr!=null)
        {
          ListNode temp=curr.next;
          curr.next=prev;
          prev=curr;
          curr=temp;
        }
        return prev;

    }
}

## Problem2 (https://leetcode.com/problems/remove-nth-node-from-end-of-list/)
## Time Complexity:O(n) Space Complexity:O(1)
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
     
        ListNode slow = head, fast = head;

      
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        
        if (fast == null) {
            return head.next;
        }

      
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        
        slow.next = slow.next.next;

        return head;
    }
}
## Problem3 (https://leetcode.com/problems/linked-list-cycle-ii/)
## Time complexity:O(n) Space Complexity:O(1)
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        if(head==null) return null;
        boolean flag=true;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                flag=false;
                break;
            }
        }
        if(flag) return null;
        slow=head;
        while(slow!=fast)
        {
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}

