// Time Complexity :O(n) -> number of nodes
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
//

public class removeNthNodeFromEnd {
    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    // Your code here along with comments explaining your approach
    // 1. Use sliding window approach .Have two pointers at start. Move second pointer till n becomes 0 or n times .
    // 2 . Now slide this window till end i.e move both pointers one step at a time till second pointer reaches end.
    // 3. Now next node of first pointer will be nth node . Now change next node of first pointer to next next node of first pointer.
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p1 = head;
        ListNode p2 = head;
        while(n>0 && p2.next!=null){
            p2 = p2.next;
            n--;
        }
        if(n!=0) return head.next;
        while(p2.next!=null){
            p1 = p1.next;
            p2 = p2.next;
        }
        p1.next = p1.next.next;
        return head;
    }

    // Your code here along with comments explaining your approach
    // 1. Calculate length of linked list
    // 2. Start from root node and delete node at the given position from end by pointing deleted node's previous node to deleted nose's next node.
    public ListNode removeNthFromEnd2(ListNode head, int n) {
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
