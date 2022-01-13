// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach


class Solution {
    public ListNode reverseList(ListNode head) {
         if (head == null) return head;
        
          ListNode prev = null;
         ListNode cur = head;
        
         while(cur != null){
             ListNode post  = cur.next;
             cur.next = prev;
             prev = cur;
             cur = post;
         }
         return prev;
   }
}      

//Time complexity: O(N)
//Space complexity: O(N)
//recursion way
   Class Solution{
    public ListNode reverseList(ListNode head ) {
         if (head == null) return null;
         else if (head.next == null) return head;
        
         ListNode curnext = headi.next;
         head.next = null;
         ListNode revlist = reverseList(curnext);
         curnext.next = head;
          return revlist;

      }
    }
        



//Time complexity: O(N)
//Space complexity: O(1)

public ListNode removeNthFromEnd(ListNode head, int n) {
    
    ListNode start = new ListNode(0);
    ListNode slow = start, fast = start;
    start.next = head;
    
    
    for(int i=1; i<=n+1; i++)   {
        fast = fast.next;
    }
    
    while(fast != null) {
        slow = slow.next;
        fast = fast.next;
    }

    slow.next = slow.next.next;
    return start.next;
}



//Time complexity : O(n)
//Space complexity : O(1)


public ListNode detectCycle(ListNode head) {
    if (head == null || head.next == null) {
        return null;   // no circle
    }
    ListNode slow = head, fast = head;
    while (fast != null && fast.next != null) {
        fast = fast.next.next;
        slow = slow.next;
        if (fast == slow) {  // circle detected
            while (head != fast) {
                fast = fast.next;
                head = head.next;
            }
            return head;
        }
    }
    return null; // no circle
}
