# problem 1 : 206. Reverse Linked List : https://leetcode.com/problems/reverse-linked-list/
# Time Complexity : O(n)
# Space Complexity : O(1): for iterative and O(n) for recursive 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        ## iterative
#         if head is None or head.next is None:
#             return head
#         p1, p2 = None, head
#         while p2 :
#             temp = p2.next
#             p2.next = p1
#             p1 = p2
#             p2 = temp	
        
#         return p1

        ## recursive
        if head is None or head.next is None:
            return head
        node = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        return node
        


# problem 2 : 19. Remove Nth Node From End of List : https://leetcode.com/problems/remove-nth-node-from-end-of-list/
# Time Complexity : O(n)
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        if n == 0:
            return head
        dummy = ListNode(-1)
        dummy.next = head
        slow, fast = dummy, dummy
        for i in range(n+1):
            fast = fast.next
        while fast :
            fast= fast.next
            slow = slow.next
        
        slow.next = slow.next.next
        return dummy.next
        

# problem 3 : 142. Linked List Cycle II : https://leetcode.com/problems/linked-list-cycle-ii/
# Time Complexity : O(n)
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        if head is None:
            return None
        slow, fast = head, head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                break
        if not fast or not fast.next:
            return None
        # while head != fast:
        #     head = head.next
        ptr = head
        while ptr != slow:
            ptr = ptr.next
            slow = slow.next
        return ptr

