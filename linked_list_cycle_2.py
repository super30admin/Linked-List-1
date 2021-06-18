# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    '''
    Time Complexity: O(n)
    Space Complexity: O(n)
    '''
    def detectCycle(self, head: ListNode) -> ListNode:
        set_list = set()
        
        node = head
        
        # visit the node and see if it is in the list, if so then we've found the cycle
        while node is not None:
            if node in set_list:
                return node
            else:
                set_list.add(node)
                node = node.next
        
        return None