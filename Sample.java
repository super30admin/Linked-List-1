// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode n=head;
        ListNode prev=null;
        while(n!=null)
        {
            ListNode tmp=n.next;
            n.next=prev;
            prev=n;
            n=tmp;
        }
        return prev;
    }
}

------------------------------------------------------------------------------------------------------
// Time Complexity :O(n)
// Space Complexity :O(1)
class Solution {
   public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode behind = new ListNode(0);
    behind.next = head;
    ListNode first = behind;
    ListNode second = behind;
    for (int i = 1; i <= n + 1; i++) {
        first = first.next;
    }
    while (first != null) {
        first = first.next;
        second = second.next;
    }
    second.next = second.next.next;
    return behind.next;
}
}




------------------------------------------------------------------------------------------------------
// Time Complexity :O(n)
// Space Complexity :O(1)
public class Solution {
    private ListNode getIntersect(ListNode head) {
        ListNode s = head;
        ListNode f = head;

      
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
            if (s == f) {
                return s;
            }
        }

        return null;
}

    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }

        
        ListNode intersect = getIntersect(head);
        if (intersect == null) {
            return null;
        }

        
        ListNode ptr1 = head;
        ListNode ptr2 = intersect;
        while (ptr1 != ptr2) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        return ptr1;
    }
}