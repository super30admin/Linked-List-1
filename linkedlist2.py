# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow, fast = head, head
        temp = True
        if head == None:
            return None
        if head.next == None or head.next.next == None:
            return None
        if head.next == head:
            return head
        while fast and fast.next:
            if slow == head and fast == head and temp:
                slow = head.next
                fast = head.next.next
                temp = False
            else:
                if slow == fast:
                    break
                elif slow.next == None or fast.next.next == None:
                    return None
                else:
                    slow = slow.next
                    fast = fast.next.next
        while head is not slow:
            if head.next == None or slow.next == None:
                return None
            head, slow = head.next, slow.next
        return head
            
                    
                    
                    
                    
            
