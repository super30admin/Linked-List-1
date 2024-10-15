# time O(n) | space O(1)

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:

        # base case
        if not head or not head.next:
            return None
        
        slow = fast = head
        # cyclic=False

        # while fast and fast.next:
        #     slow = slow.next
        #     fast = fast.next.next

        #     if slow==fast:
        #         cyclic = True
        #         break

        # if not cyclic:
        #     return None
        
        # # logic
        # # cycle head is always equi distance from head and meeting point
        # slow = head
        # while slow!=fast:
        #     slow = slow.next
        #     fast = fast.next

        # return slow

        while fast.next and fast.next.next:
            slow = slow.next
            fast = fast.next.next

            if slow==fast:
                slow=head
                while slow!=fast:
                    slow = slow.next
                    fast = fast.next
                return slow
        return None