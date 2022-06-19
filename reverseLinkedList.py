"""Approach 1: Reverse with recursion
TC O(n)
SC O(n) - stack space is used for each node

In this approach we push each node in the stack during recursion and then once we hit the node
that is either None or its next pointer is None, we terminate recursion and return
that node. Store that node as new head of linkedList.
Then for each node at n-1(2nd last node) till the original head node continue doing
head.next.next = head - so make next node for current node point back to current node.

Value of reverse is correctly set to the new head because when we hit the last node, it 
returns that node and we store it in reverse, and as the recursion unwinds, we keep returning
same reverse node without any updates.
"""
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head or not head.next:
            return head
        
        reverse = self.reverseList(head.next)

        head.next.next = head
        head.next = None
        return reverse


"""Approach2:
TC and SC same as above.
The difference here is we used a helper function. And only reversed list using
head.next.next=head.
When helped returns to calling function reverseList, at that point we check if 
original head is not None. And then set its next pointer to None. To visualize,
when we return the flow we have something like this:

a <=> b <- c <- d
see in a and be they are both pointing to each other.

we change it to look like:
a <- b <- c <- d

hence we do 
if head:
    head.next = None

If we don't do that, we get this:
Wrong Answer
Runtime: 25 ms
Your input
[1,2,3,4,5]
Output
Error - Found cycle in the ListNode
Diff
Expected
[5,4,3,2,1]
"""
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        reverse = self.helper(head)
        if head:
            head.next = None
        return reverse
        
        
        
    def helper(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head or not head.next:
            return head
        
        reverse = self.reverseList(head.next)

        head.next.next = head
        
        return reverse

"""Approach 3: 3 pointers
TC O(n)
SC O(1)
initialize p1,p2,p3 such that, p1 is None, p2 is head and p3 is head.next
then in a loop, while p3 is not None, continue doing
p2.next =p1
p1 = p2
p2 = p3
p3 = p3.next

and when loop breaks, do one last p2.next = p1 to make sure last node is also pointing to previous node correctly.
This is because loop ends before Node N and Node N-1 are processed as p3 goes out of bound.
then set head = p2 and return head or just return p2 directly, both works in Leetcode.

"""

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:
            return head
        if not head.next:
            return head
        
        p1 = None
        p2 = head
        p3 = head.next
        while p3:
            p2.next = p1
            p1 = p2
            p2 = p3
            p3 = p3.next
        p2.next = p1
        head = p2
        return head


"""Approach 4: Iterative recursion mimic using Stack
We can use stack to push nodes on to stack
then pop top node, and store that as the new head (reverse)
and for every other node popped from stack, do n.next.next=n
head.next = None to avoid cycle in the linked-list.
return reverse head node from above.
TC O(n)
SC O(n) for stack
Works perfectly on Leetcode.
"""
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head or not head.next:
            return head
        stack = list()
        p1 = head
        while p1:
            stack.append(p1)
            p1 = p1.next

        reverse = stack.pop()
        while stack:
            n = stack.pop()
            n.next.next = n
        
        head.next = None
        return reverse

