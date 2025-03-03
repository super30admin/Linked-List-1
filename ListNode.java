// problem 1
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :YES 
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach
public class ListNode {
        int val;
       ListNode next;
      ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
class Solution {
    public ListNode reverseList(ListNode head) {

        // Base case

        if (head == null || head.next == null) {

            return head;

        }
        ListNode prev = null; 
        ListNode curr = head;
       while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;


        }


        return prev;

    }
}

//problem 2
// Time Complexity :O(L), where L is the length of the list.
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :YES 
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

       ListNode HEAD=head, temp=head;

       while(n>0 && temp.next!=null){

           temp=temp.next;

           n--;

       }

       if(n==1) return HEAD.next;

       if(n>1) return null;

       while(temp.next!=null){

           temp=temp.next;

           head=head.next;

       }

       head.next=(head.next).next;

       return HEAD;

   }
}

//problem 3
// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :YES 
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach

public class Solution {
    public ListNode detectCycle(ListNode head) {

ListNode slow = head, fast = head;

while(fast != null && fast.next != null) {

fast = fast.next.next;

slow = slow.next;

if (slow == fast) {

while (head != slow) {

head = head.next;

slow = slow.next;

}

return slow;

}

}

return null;

}
}