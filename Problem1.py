'''
Approach 1: Recursive
1. Go to the last but one node
2. Modify the link of last node to point to second last node
3. Return the last node as it is the new head 

TC: O(n)
SC: O(n) - recursive stack
'''
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None or head.next == None:
            return head

        reversedL = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        return reversedL
    
'''
Approach 2: Iterative - 2 pointers
1. Maintain 3 pointers - prev, curr, fast
2. Iterate till fast is not None and modify the pointers to reverse in place 
3. Return the curr pointer as it is the new head but before that modify the last node's next to point to prev

TC: O(n) 
SC: O(1) 
'''
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None or head.next == None:
            return head

        prev = None
        curr = head
        fast = head.next

        while fast != None:
            curr.next = prev
            prev = curr
            curr = fast
            fast = fast.next
        
        curr.next = prev
        return curr

        