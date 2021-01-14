'''
Complexity:
Time: O(n)
Space: O(n)
'''
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        if(head==None or head.next==None):
            return None
        x = set()
        fast = head
        while(fast!=None):
            if(fast not in x):
                x.add(fast)
            else:
                return fast
            fast = fast.next
        
        return None
