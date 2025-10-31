# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Yes


# Your code here along with comments explaining your approach

# Set a prev, a curr pointing to head. in the while loop currnt.next points to the prev node. But now the connection to original curr.next is broken. 
# So we store that to a temp node. and then we set curr to that original curr.next

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev = None
        curr = head
        while curr:
            temp = curr.next
            curr.next = prev
            prev = curr 
            curr = temp
        return prev


# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Yes


# Your code here along with comments explaining your approach
# Used the two-pointer technique with a dummy head (prev) to safely handle edge cases (like removing the first node). 
# By advancing fast n+1 steps ahead, you ensured that when fast reaches the end, slow is at the node just before the one to remove.
# Then set slow to slow.next.next

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        prev = ListNode(None,head)
        slow = prev 
        fast = prev
        for _ in range(n+1):
            fast = fast.next
        while fast:
            slow = slow.next
            fast = fast.next
        temp = slow.next
        slow.next = slow.next.next
        temp.next = None
        return prev.next



# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Yes


# Your code here along with comments explaining your approach


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None:
            return None
        slow = head
        fast = head
        flag = False
        while fast.next and fast.next.next:
            slow = slow.next
            fast = fast.next.next

            if slow == fast:
                flag = True
                break
        
        if not flag:
            return None

        slow = head
        while slow != fast:
            slow = slow.next
            fast = fast.next

        return slow


        
        