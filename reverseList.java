/* 
 //Definition for singly-linked list.
 public class ListNode {
   int val;
   ListNode next;
   ListNode() {}
   ListNode(int val) { this.val = val; }
   ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }
 

class ReverseList {
    public ListNode reverselist(ListNode head) {
        //Tc: O(N)  Sc: O(1)
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null)
        {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}

*/