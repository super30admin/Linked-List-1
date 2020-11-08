//Time complexity: O(n)
//Space Complexity: O(1)
//Program ran successfully
/*
    Algorithm: 1. To reverse a linked list, we need to modify the next pointers of each node
               2. Three pointers are used to traverse the list
               3. One pointer points to the node that we are currently at
               4. One pointer points to the next node of the linked list(fast pointer)
               5. And one pointer keeps track of the previous element of the list 
               6. At each node, the current node's next pointer is made to point to the previous pointer
*/
class Solution {
    public ListNode reverseListIterative(ListNode head) {
        if(head == null) return head;
        ListNode prev = null;
        ListNode current = head;
        ListNode fast = head.next;
        while(fast != null){
            current.next = prev;
            prev = current;
            current = fast;
            fast = fast.next;
        }
        current.next = prev;
        return current;
    }
}
