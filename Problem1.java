
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this :NO

public class Problem1 {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        //Use 3 pts prev -> null (as this would be last node.next)
        //curr -> which will start from head
        //next -> always ahead of next
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = head.next;
        //move until next != null
        while(next != null){
            //now start reversing as curr.next will point to prev instead of next
            curr.next = prev;
            //prev will be updated to curr
            prev = curr;
            //curr will be updated to next
            curr = next;
            //next is next.next
            next = next.next;
        }
        //at the end when next == null  then curr ptr would have been left as its next is not pointing to anything
        curr.next = prev;
        return curr;

    }
}
