# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    
    """
    Description: Reverse a singly linked list
    
    Time Complexicity: O(n), n ->  number of items in given linked list
    Space Compexicity: O(1)
    
    Approach:
    To switch pointers in the linked list, 2 variables were created
    1. temp -> to store information for head
    2. prev -> pointing to previous item in the given list
    Iterate above 2 until head == None in while loop to get the answer
    """
    
    def reverseList(self, head: ListNode) -> ListNode:
        prev = None
        while head:
            temp = head
            head = head.next
            temp.next = prev
            prev = temp
            
        return prev
       
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    
    """
    Description: Remove Nth node from end of the List
    
    Time Complexicity: O(n), n -> number of items in linked list
    Space Complexicity: O(1)
    
    Approach:
    2 pass
    1. start a dummy node (edge case) with dummy.next = head
    2. start 2 pointers, say first and second move second by count = n (first pass)
    3. Move pointers until second.next == None (second pass)
    """
    
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        
        if head == None: return
        # Create a dummy node (edge case when only one element in the linked list)
        dummyNode = TreeNode(-1)
        dummyNode.next = head
        
        first = dummyNode; second = dummyNode
        # Move second by count = n
        for _ in range(n):
            second = second.next
            
        # Move first node just before the target node to remove
        while second.next != None:
            first = first.next
            second = second.next
            
        first.next = first.next.next
        
        return dummyNode.next
        
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    
    """
    Description: Given a linked list, return the node where the cycle begins. If there is no cycle, return null
    
    Time Complexicity = O(n)
    Space Complexicity = O(1)
    
    Approach (without using a hashset)
    1. start 2 pointers (slow, 1x and fast, 2x) to find cross of both (1 pass)
    2. if they never cross return None, if they do start fast back from head and move 1x for both
    3. when they meet again, it will be a node of the cycle (Floyd's algorithm)
    """
    def detectCycle(self, head: ListNode) -> ListNode:
        
        if head == None: return
        
        flag = False
        slow = head; fast = head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                flag = True
                break # prevent infinite loop 
            
        if not flag: return None
        
        fast = head
        while slow != fast:
            fast = fast.next
            slow = slow.next
            
        return slow
    
    
    """ Alternative solution with 
    # Time Complexicity  = O(n)
    # Space Complexicity = O(n)
    def detectCycle(self, head: ListNode) -> ListNode:
    
        if head == None: return 
        node_set = []
        
        curr_node = head
        while curr_node != None or curr_node in node_set:
            node_set.append(curr_node)
            curr_node = curr_node.next
            if curr_node in node_set:
                return curr_node
    """        
