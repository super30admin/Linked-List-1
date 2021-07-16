# Time Complexity : O(n)
# Space Complexity : O(1)


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        if not head:
            return None 

        slow = fast = head 
        flag = False 

        while fast != None and fast.next != None:
            slow = slow.next 
            fast = fast.next.next 
            if slow == fast:
                flag = True 
                break 

        if not flag:
            return None 

        slow = head 
        while fast != slow:
            slow = slow.next 
            fast = fast.next 

        return fast