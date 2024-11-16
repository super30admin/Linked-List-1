# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:
            return head
        slow, fast = head, head
        flag = True

        while fast.next != None and fast.next.next != None:
            slow = slow.next
            fast = fast.next.next
        
            if(slow == fast):
                flag = False
                break

        if flag == True: #no cycle
            return None
        
        slow = head
        while slow != fast:
            slow = slow.next
            fast = fast.next

        return fast
