// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// if there is a cycle slow and fst pointer will defenitely meet. start of cycle will be equal distace from head and
// meeting point.

public ListNode detectCycle(ListNode head) {
    if(head == null || head.next == null) return null;
    ListNode slow = head;
    ListNode fast = head;
    do{
        slow = slow.next;
        fast = fast.next.next;
    }while(slow != fast && fast != null && fast.next != null);
    if(fast == null || fast.next == null) return null;
    while(slow != head){
        slow = slow.next;
        head = head.next;
    }
    return slow;
}