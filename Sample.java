// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
//used fast and slow pointers to find the cycle{if the fast slow pointers meet there's a cycle if not no cycle}
//boolean flag intially false if there's a cycle will make it true
//if boolean flag is false will return null
//else will again traverse through linked list to get head will reset one of the pointers to head and move with 1x speed
//will have conditin fast!= slow if they met at a place the loop will terminte
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        ListNode fast = head;
        ListNode slow = head;
        boolean flag = false;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                flag = true;
                break;
            }
 
        }
        if(!flag) return null;
        fast = head;
        while(fast!=slow){
               
                fast = fast.next;
                slow = slow.next;
        }
            return slow;
    }
}

// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
//to handle the edge case when have onle one node and n=1 taken a dummy node
//used two pinters one is slow and one is fast both poiting to head
//will have count and will udate with fast, use sliding window pattern will move our fast utill count is less than n
//after fast breaches the condtion will start moving fast and slow at at time by 1x speed until fast.next!= null
//on that time slow is at n-1 will move our slow to next.next so that wiil remove the nth node
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count =0;
        while(count < n){
            fast = fast.next;
            count++;
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
// Time Complexity :O(N)
// Space Complexity :for  iterative O(1) and O(N) for recursion as we are using stack under the hoods
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        //ListNode dummy = new ListNode(-1);
      //   if(head == null || head.next == null) return head;
      //   ListNode previous = null;
      //   ListNode current = head;
      //   ListNode fast = head.next;
      //   while(fast!= null){
      //       current.next = previous;
      //       previous = current;
      //       current = fast;
      //       fast = fast.next;
      //   }
      // current.next = previous;
      //   return current;
    if(head == null || head.next == null) return head;
        ListNode reversed =reverseList(head.next);
            head.next.next = head;
            head.next = null;
        return reversed;
    }

    
    
}