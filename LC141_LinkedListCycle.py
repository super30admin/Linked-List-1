# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None
"""
approach 1 : we add all visited nodes to a hashset, and every time we go to a new node, we check if that one is already there in the hashset
TC = O(n)
SC = O(n)

"""

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        seen = set()
        while head is not None:
            if head in seen:
                return True
            seen.add(head)
            head = head.next
        return False

"""
Approach 2: we maintain a slow and a fast pointer. The slow pointer moves ahead 1 step at a time and the fast pointer moves 2 steps at a time. 
If there is a cycle in the Linked List, the slow and the fast pointers will meet at some point.

If there is a cycle in the Linked List, the fast will never be able to reach the end (NULL) of the Linked List and the slow will be able to catch it

TC = O(n)
SC = O(n)

"""


class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        if head is None:
            return False
        slow = head
        fast = head.next
        while fast is not None and fast.next is not None:
            if slow == fast:
                return True
            slow = slow.next
            fast = fast.next.next
        return False
            
        

