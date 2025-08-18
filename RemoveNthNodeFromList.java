// Time Complexity : O(n) — two passes (count size, then remove node)
// Space Complexity : O(1)
// Did this code successfully run on LeetCode : Yes

// approach:
// 1) Count total size of list in first pass.
// 2) If n == size, return head.next (remove first node).
// 3) Else, move to (size - n)-th node, adjust its next pointer to skip target.


public class RemoveNthNodeFromList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            return null;
        }

        ListNode curr = head;
        int size = 0;
        while(curr != null){
            curr = curr.next;
            size++;
        }

        if(n == size){
            return head.next;
        }

        int indexToSearch = size - n;
        int i = 1;
        ListNode prevNode = head;
        while(i < indexToSearch){
            prevNode = prevNode.next;
            i++;
        }

        prevNode.next = prevNode.next.next;
        return head;
    }
}
