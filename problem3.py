#time complexity: O(n) 
#space complexity: O(1) 
#submit on leetcode: yes

# Definition for singly-linked list.
class ListNode:
     def __init__(self, x):
        self.val = x
        self.next = None


class Solution:
    def detectCycle(self, head: [ListNode]) -> [ListNode]:
        # base case
        if head is None or head.next is None:
            return None

        slow = head
        fast = head

        while fast is not None and fast.next is not None:
            slow = slow.next 
            fast = fast.next.next  

            if slow == fast:
                break
        
        if fast is None or fast.next is None:
            return None
        
        fast = head
        while fast != slow:
            slow = slow.next 
            fast = fast.next
        
        return fast