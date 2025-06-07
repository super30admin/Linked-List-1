# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

# Time complexity - o(n)
# Space complexity - o(1)
class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:

        if not head or not head.next:
            return None
        
        slow = head
        fast = head
        flag = False

        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                flag = True
                break

        if not flag:
            return None
        
        fast = head

        while fast!=slow:
            
            fast = fast.next
            slow = slow.next
        
        return slow
