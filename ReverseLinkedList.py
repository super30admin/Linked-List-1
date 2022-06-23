# 206. Reverse Linked List
"""
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach
Using itterative solution.
We parse from head to end, as we do that, we change diretion of pointer(next).
In order not to lost once direction is changed, a pointer is used to store node.
Total 3 pointers are used. In end, head is returned
"""



# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # initialized None because if we initialize as node, it will still have effect at end. We do not want that.
        temp = None

        # null
        if head == None:
            return head

        # logic
        fast = head.next

        # iterating through LL and changing next pointers.
        while (fast != None):
            head.next = temp
            # print(fast)
            temp = head
            head = fast
            fast = fast.next
            # print(head)

        head.next = temp

        return head