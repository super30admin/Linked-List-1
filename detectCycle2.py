# // Time Complexity :O(N)
# // Space Complexity :o(1),O(n)
# // Did this code successfully run on Leetcode :YES
# // Any problem you faced while coding this :no


# // Your code here along with comments explaining your approach
# one approach is involving set where we add values  to to set before that we check if node is present in set or not, other one would slow and fast pointers fast moves twice speed of slow they 
# meet at one point in cycle this might ot might not be tail or head of cycle so move slow pointer to head then move both pointer s by single node at a time 
# they will meet at head of cycle for sure
                               """
At the meeting point:

Slow pointer has traveled: a + b
Fast pointer has traveled: a + b + k×L = a + b + k×(b + c)

Since fast travels twice as far as slow:
2(a + b) = a + b + k×(b + c)
2a + 2b = a + b + k×b + k×c
a + b = k×b + k×c
a + b = k×(b + c)
a = k×(b + c) - b
a = k×(b + c) - b
a = (k-1)×(b + c) + c
                               """


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        s = set()
        curr = head
        while curr:
            if curr in s:
                return curr  # Return the node where the cycle begins
            s.add(curr)
            curr = curr.next
        return None
  ##################################################################################################
  # Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        #use slow fast pointers
        slow,fast=head,head
        if head==None or head.next==None:return None
        while(fast is not None and fast.next is not None):
           
            
            slow=slow.next
            fast=fast.next.next
            if slow ==fast:break
        if slow!=fast:return None
        
        slow=head
        while(slow!=fast):
            slow=slow.next
            fast=fast.next

        return slow
