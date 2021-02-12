package S30.LinkedList;


/*  Successfully ran on leetcode

    Time complexity: O(n), we have to traverse entire list to reverse.
    Space complexity: O(1), no extra space is used

    Approach: using three pointers to keep track of previous, current and next nodes every iteration

*
* */

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null)
            return head;
        ListNode prev = null, current = head, p1 = null;
        if(head.next == null){
            return head;
        }else{
            while(current != null){
                p1 = current.next;
                current.next = prev;
                prev = current;
                current = p1;
                if(p1 != null)
                    p1 = p1.next;
            }
        }
        return prev;
    }

}
