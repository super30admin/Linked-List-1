/* 
# we have to add dummy node as we have to deal with delete at head and delete in between separately if we dont add that
# also it is given that n will be always valid so we are not checking that condition
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        if head is None:
            return head
        
        dummy = ListNode(-1)
        start, end = dummy, dummy
        dummy.next = head
        
        
        for i in range(n+1):   
            end = end.next
            
        while end is not None:
            start = start.next
            end = end.next
        
        temp = start.next
        start.next = start.next.next
        if temp is not None:
            temp.next = None
        
        return dummy.next


*/

// Time Complexity : O(n) single pass where n is no of nodes
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach: started with a dummy node and moved only end pointer till n and after that
// moved start till end is not null. Its based on fact that end(travelled till n) + end(travelled till null) = size of linkedlist

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null){
            return head;
        }
        ListNode dummy = new ListNode(-1);
        ListNode start= dummy, end=dummy;
        dummy.next = head;
        
        for (int i=0; i<=n; i++){
            end = end.next;
        }
        
        while (end != null){
            start = start.next;
            end = end.next;
        }
        
        ListNode temp = start.next;
        start.next = start.next.next;
        if (temp.next != null){
            temp.next = null;
        }
        return dummy.next;
    }
}
        
        