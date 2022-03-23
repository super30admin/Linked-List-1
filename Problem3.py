#Time Complexity : O(n)
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : YES
#Any problem you faced while coding this : NO

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        if head == None:
            return head
        slow = head
        fast = head
        flag = True
        while fast!=None and fast.next!=None:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                flag = False
                break
        if flag == True:
            return None
            
        slow = head
        while slow!=fast:
            slow = slow.next
            fast = fast.next
            
        return slow