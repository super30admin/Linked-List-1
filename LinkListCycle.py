'''
time complexity: O(n)
space complexity: O(1)
'''
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        ptr1 = head
        ptr2 = head
        cycle = False
        while( ptr2 and ptr2.next!=None and ptr2.next.next!=None):
            ptr1 = ptr1.next
            ptr2 = ptr2.next.next
            if(ptr1==ptr2):
                cycle=True
                break
        if(cycle==False):
            return None
        ptr1 = head
        while(ptr1!=ptr2):
            ptr1 = ptr1.next
            ptr2 = ptr2.next

        return ptr1
