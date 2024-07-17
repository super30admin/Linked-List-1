# time: O(n)
# space: O(1)

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:
            return None
        
        slow, fast = head, head
        flag = False

        while fast.next!=None and fast.next.next!=None:
            slow = slow.next
            fast = fast.next.next

            if slow==fast:
                flag = True
                break
            
        if not flag:
            return None
        
        fast = head

        while slow!=fast:
            fast = fast.next
            slow = slow.next
        
        return fast

        
        fast = head

        while slow!=fast:
            slow= slow.next
            fast = fast.next

        return fast
        