# Time Complexity : O(N) for iterative, recursive
# Space Complexity : O(1) for iterative, O(N) internally for recursive
# Did this code successfully run on Leetcode : Yes, both iterative and recursive
# Any problem you faced while coding this : kept assigning head.next.next = head.next 
# and got cycle, i.e node pointing to itself, in the recursive solution

# Your code here along with comments explaining your approach : In the iterative solution, three pointers,
# a previous prev, a current curr and a next pointer called fast, assign current's next to prev first 
# as current's next is initially pointed to by fast. Then, assign curr to prev, 
# assign fast to curr and advance fast to fast.next
# in the end, as fast is at null, have to assign current's next to prev

# RECURSIVE: push parent on recursive stack and call with the baby,
# if head is null or head.next is null, we return head
# so when we reach the last element, head is returned and we save that reference
# in order to return the reversed list at the end
# assign head to head.next.next and None to head.next

class ListNode:
    def __init__(self, val=0, next = None):
        self.val = val
        self.next = None

class Solution:
    
    def reverseList(self, head):
        
        # this is the recursive solution

        # if not head or not head.next:
        #     return head
        # ret = self.reverseList(head.next)
        # head.next.next = head
        # head.next = None
        # return ret

        # iterative solution
        if head is None or head.next is None:
            return head
        prev = None
        curr = head
        fast = head.next
        while fast is not None:
            curr.next = prev
            prev = curr
            curr = fast
            fast = fast.next
        curr.next = prev
        return curr

