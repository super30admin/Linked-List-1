// Time Complexity :O(n) since we are processing each link 
// Space Complexity :O(1) since we can do it constant space(iterative)
//  for (recursive) O(n) since it has to maintain a call stack until the end of list is reached
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach

// we keep two ptrs curr and prev in order to not lose the prev ptrs

class Solution {
    public ListNode reverseList(ListNode head) {
        // iterative
        // base case if we have a single or no entry
        if (head == null || head.next == null)
            return head;

        ListNode prev = null, curr = head;

        // until the curr node is not null, create tempNext which is the currents next
        // ptr
        // and then reverse the links and move the p to curr and curr to next.
        while (curr != null) {
            ListNode tempNext = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tempNext;
        }
        // this has the head of reversed linked list
        return prev;
    }

}

class Solution {
    public ListNode reverseList(ListNode head) {
        // recursive

        // base case
        // here the base case is head==null and head.next== null since in this way we
        // can return the head of the reversed linkedlist
        // we will reach this case at the end of the recursion call stack
        if (head == null || head.next == null)
            return head;

        // we recursively call this function on head.next and keep on passing the head
        // of the reversed linked list
        ListNode p = reverseList(head.next);

        // for eg 1->2->3->null (lets say node is at 2)
        // so head.next is 3 so we update 3s pointer to point at 2.
        // 1->2<-3<-null and 2 points to null
        head.next.next = head;
        head.next = null;
        return p;

    }

}