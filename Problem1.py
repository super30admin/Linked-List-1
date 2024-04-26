# Linked-List-1

## Problem1 (https://leetcode.com/problems/reverse-linked-list/)


#Approach
# keep 3 pointers. Set prev = head, curr = head.next and set prev.next = None. While curr != None, create a tep varioable to keep track of curr.next none
# At each iteration set curr.next = prev, prev = curr and curr = temp to move forward
# Return prev

# Time Complexity: O(n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head or not head.next:
            return head

        prev = head
        curr = head.next
        prev.next = None
        
        while(curr!=None):
            temp = curr.next  
            curr.next = prev
            prev = curr
            curr = temp
        return prev