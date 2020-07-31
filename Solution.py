'''
PROBLEM 1

TIME COMPLEXITY: O(N)
SPACE COMPLEXITY: O(N)

- apply recursion and pass head.next to the resursion function
- when head is None or head.next is None, return head, we have to return the last element as the head in the end
- set the new connection as head.next.next and remove the earlier connection by head.next=null

'''

# RECURSIVE SOLUTION

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if head==None or head.next==None:
            return head
        
        
        node=self.reverseList(head.next)
        head.next.next=head
        head.next=None
        return node
        
        
'''
PROBLEM 1

TIME COMPLEXITY: O(N)
SPACE COMPLEXITY: O(1)

- use three pointers prev=None, current=head and fast=head.next
- iterate until fast reaches end of of the Linked List and keep assigning the prev to current and fast to current and fast.next to fast
- at the end, we will need to assign head to current and return head

'''
# ITERATION SOLUTION
        
class Solution:
    def reverseList(self, head: ListNode) -> ListNode: 
        if head==None:
            return None
        prev=None
        current=head
        fast=head.next
        
        while(fast!=None):
            current.next = prev
            prev=current
            current=fast
            fast=fast.next
        current.next=prev
        head=current
        return head
        
        
        
'''
PROBLEM 2

TIME COMPLEXITY: O(N)
SPACE COMPLEXITY: O(1)

- we will use a dummy node  to start with, use two pointers slow and fast initially pointing to dummy
- iterate fast equal to the n so that difference between slow and fast is n
- iterate unitl fast reaches the end of the Linked List, then remove the link at the slow pointer by doing slow.next=slow.next.next

'''

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        dummy= ListNode(0)
        dummy.next=head
        fast=dummy
        slow=dummy
        count=0
        while(count<=n):
            count+=1
            fast=fast.next
        
        while(fast!=None):
            fast=fast.next
            slow=slow.next
        
        slow.next=slow.next.next
        return dummy.next

'''
PROBLEM 3

TIME COMPLEXITY: O(N)
SPACE COMPLEXITY: O(1)

- we will use two pointers slow and fast initially pointing to head
- iterate fast with two times the speed of slow until they point to the same node or until fast or fast.next becomes null
- if fast or fast.next become None, then no  cycle exists and return None. Else: assign slow to head and iterate slow and fast by one node until they point to same node
which would be the start of the cycle.

'''
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        slow=head
        fast=head
        
        while(fast!=None and fast.next!=None):
            slow=slow.next
            fast=fast.next.next
            if slow==fast:
                break
            
        if fast==None or fast.next==None:
            return None
        else:
            slow=head
            while(slow!=fast):
                slow=slow.next
                fast=fast.next
            
        return slow