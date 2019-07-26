// Time Complexity :O(n) -> number of nodes
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
//
// Your code here along with comments explaining your approach
// 1. Calculate length of linked list
// 2. Start from root node and delete node at the given position from end by pointing deleted node's previous node to deleted nose's next node.
public class removeNthNodeFromEnd {
    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode copy = head;
        //ListNode result = head;
        int length = 1;
        while(copy.next!=null){
            length++;
            copy = copy.next;
        }
        if(length == 1)
            return null;
        if(length == n){
            head = head.next;
            return head;
        }
        copy = head;
        int x = 1;
        ListNode prev = copy;
        while(copy!=null){
            if(length-n+1==x){
                prev.next = copy.next;
            }
            prev = copy;
            copy = copy.next;
            x++;

        }
        ///System.out.println(length);
        return head;
    }
}
