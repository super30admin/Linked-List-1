# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        flag = False
        slow = head
        fast = head

        if fast is None or fast.next is None:
            return None

        while fast is not None and fast.next is not None:
            slow = slow.next
            fast = fast.next.next

            if(slow == fast):
                flag = True
                break
        
        if not flag:
            return None

        fast = head
        while slow != fast:
            slow = slow.next
            fast = fast.next
        
        return slow


         