// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No

// Your code here along with comments explaining your approach
public ListNode removeNthFromEnd(ListNode head, int n) {
    if(head == null) return null;
    //we create a dummmy node and point it's next pointer to head
    //we also take in two pointers fast and slow
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode fast = dummy;
    ListNode slow = dummy;
    
    for(int i = 1; i <= n + 1; i++){
        fast = fast.next;
    }
    //when fast is pointing to null, slow.next will point to the node to be removed
    while(fast != null){
        slow = slow.next;
        fast = fast.next;
    }
    slow.next = slow.next.next;
    return dummy.next;
}