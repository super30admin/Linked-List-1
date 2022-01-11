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

  // Time Complexity :O(m)
  // Space Complexity : O(m) m is the number of nodes in the linked list
  // Did this code successfully run on Leetcode :
  // Any problem you faced while coding this :


  // Your code here along with comments explaining your app
  // using extra space which is very bad solution but still thought so implemented
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> list = new ArrayList<>();

        ListNode curr = head;

        while(curr != null){
            list.add(curr);
            curr = curr.next;
        }

        int len = list.size();

        if(len - n == 0){
            head = head.next;
            return head;
        }

        ListNode prev = list.get(len-n-1);
        ListNode temp = list.get(len - n);

        prev.next = temp.next;
        temp.next = null;

        return head;
    }


    // Time Complexity :O(m)
    // Space Complexity : O(1)
    // Did this code successfully run on Leetcode :
    // Any problem you faced while coding this :


    // Your code here along with comments explaining your app

    // using two pointers, maintaining a gap between two pointers from the beginning
      public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 1;
        ListNode dummy = new ListNode(-1);
        ListNode slow = dummy;
        slow.next = head;
        ListNode fast = slow;

        while(count < n+1){
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
