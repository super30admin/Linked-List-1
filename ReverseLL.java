// Time Complexity : O(N)
// Space Complexity : O(N-1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

// Recursive solution
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        // we keep dumping all the nodes to call stack, except the last
        ListNode reversed = reverseList(head.next);
        // keep unfolding every node from callStack
        // make their next's next to curr head
        head.next.next = head;
        // so that we will make the starting node's next to null, once reversed
        head.next = null;
        return reversed;
    }
}

//Time : O(N) | Space O(1)
//Iterative solution
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        if(head == null) {
            return curr;
        }
        ListNode fast = curr.next;
        while(fast != null){
            // we make curr next prev
            curr.next = prev;
            // next previous to curr
            prev = curr;
            // next curr to fast
            curr = fast;
            // fast moving ahead
            fast = fast.next;
        }
        // connecting the last node to prev
        curr.next = prev;
        return curr;
    }
}


//OWN tryouts - recursion
//Space O(N) - as we dump prev in local state
//Time O(N) -
class Solution {
    public ListNode reverseList(ListNode head) {
        return reverse(head, null);
    }
    private ListNode reverse(ListNode curr, ListNode prev) {
        if(curr == null) {
            return prev;
        }
        ListNode next = curr.next;
        ListNode nextPrev = curr;
        curr.next = prev;
        return reverse(next, nextPrev);
    }
}

//Iterative method
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null) {
            //curr becomes next iteration's prev
            ListNode nextPrev = curr;
            curr = curr.next;
            nextPrev.next = prev;
            prev = nextPrev;
        }
        return prev;
    }
}