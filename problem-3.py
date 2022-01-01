# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        slow = head
        fast = head
        flag = 0
        
        if not head:
            return
        while (fast.next and fast.next.next):
            slow = slow.next
            fast = fast.next.next
            if(slow == fast):
                flag=1
                break
        
        if (flag):
            slow = head
            while(slow!=fast):
                slow= slow.next
                fast = fast.next
            return slow      
        else:
            return None