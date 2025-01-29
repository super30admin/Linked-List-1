
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

public class RemoveNthNodeFromLL {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return null;
        }
        ListNode curr = head;
        for(int i=0;i<n;i++){
            curr = curr.next;
        }
        if(curr == null){
            head = head.next;
            return head;
        }
        ListNode first = head;
        ListNode second = curr;
        while(second.next != null){
            second = second.next;
            first = first.next;
        }
        ListNode nextNode = first.next;
        ListNode snextNode = first.next.next;
        first.next = snextNode;
        nextNode.next = null;
        return head;
    }
}
