# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

# 1. Traverse the linked list. 
# 2. Store the address of the visited nodes in the linked list.
# 3. If the node has already been visited, return that node.
# 4. Else, add it to the visited set. 
# Time complexity - O(n)
# Space complexity - O(n)
# Did this solution run on leetcode? - yes
class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        # edge case
        if not head:
            return None  
        
        # keep all linked list nodes in a set
        visited = set()
        
        node = head
        while node:
            # if node is already present in the visited set, return the node.
            if node in visited:
                return node
            # add the current node to the visited.
            visited.add(node)
            # traverse to the next node.
            node = node.next
        
        return None
            

# Floyd's Tortoise and Hare algorithm
# Time complexity - O(2L+C)
# Space complexity - O(1)
# Did this solution run on leetcode? - yes
class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        # edge case
        if not head:
            return 
        
        # find position of slow and fast pointers.
        # Time complexity - O(L+C)
        slowPtr, fastPtr = head, head  
        while fastPtr and fastPtr.next:
            slowPtr = slowPtr.next          # move the slow pointer (jump 1 node)
            fastPtr = fastPtr.next.next     # move the fast pointer (jump 2 nodes)
            if slowPtr == fastPtr:
                break
        
        # if there is no cycle in the linked list.
        if not (fastPtr and fastPtr.next):
            return None
        
        # Time complexity - O(L)
        # place ptr1 to the head and ptr2 to the fastPtr location.
        # move both the pointers.
        # Node where both the pointers meet is the location of the pointer.
        ptr1 = head
        ptr2 = fastPtr
        while ptr1 != ptr2:
            ptr1 = ptr1.next
            ptr2 = ptr2.next
            
        return ptr1
         