"""
Time Complexity : O(n) where n is the number of nodes in the Linked List.
Space Complexity : O(1) as no extra data structure is used
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No


Your code here along with comments explaining your approach:
First find the whether Linked List has cycle using slow and fast pointer with speed slow = 1x and fast = 2x
If LinkedList has cycle:
    reset the slow pointer or any one of the pointer to head and then iterate both the pointets by single steps till they meet and return the pointer set to the head.
    In this step both the pointers are increased by step 1 as the distance of head to starting point is equal to the meeting of two pointers and starting point.
else:
    return None
"""
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None or head.next == None:
            return None
        
        flag = False
        slow = head
        fast = head
        
        while fast != None and fast.next != None:
            slow = slow.next
            fast = fast.next.next
            
            if slow == fast:
                flag = True
                break
        
        if flag == False:
            return None
        else:
            slow = head
            while(slow != fast):
                slow = slow.next
                fast = fast.next
        return slow