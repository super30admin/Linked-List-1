// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:

        slow=head
        fast=head
        while fast and fast.next: # 2 pointers to detect cycle
            fast=fast.next.next
            slow=slow.next
            if slow == fast: # if cycle is present
                 while head:
                    if head == slow: # if head is slow then return head, else keep moving head
                        return head
                    head = head.next
                    slow = slow.next
        return None #return None if no cycle
        
            
            