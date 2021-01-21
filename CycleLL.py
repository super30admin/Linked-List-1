# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

# TC = O(n)
# SC = O(n)
# 1. 2 pointers with 1x and 2x speeds starting from head
# 2. When the two pointers meet a point, there is a cycle.
# 3. In order to know which node the cycle is formed, reset one of the pointers to head and traverse both at 1 x until they meet again. That node is where cycle is formed. 
# Crux: Where ever they are meeting for the first time- they are equidistant from the head and circle

class Solution:
    def detectCycle(self, head):
        slow = fast = head
        flag = False
        while fast != None and fast.next != None:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                flag = True
                break
        if not flag: return None
        slow = head
        while slow != fast:
            slow = slow.next
            fast = fast.next
        return fast