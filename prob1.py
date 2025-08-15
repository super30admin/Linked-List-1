# Reverse linked list


# Recursive
#Time complexity: O(n)
#Space complexity: O(n) due to recursion stack
class Solution:
    
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        def helper(head):
            if not head or not head.next:
                return head
            res = helper(head.next)
            head.next.next = head
            head.next = None
            return res
            
        return helper(head)
        
# Iterative
#Time complexity: O(n)
#Space complexity: O(1)
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        prev,cur = None, head
        while cur:
            # Store the next node
            temp = cur.next
            # Reverse the link
            cur.next = prev
            # Move prev and cur one step forward
            prev = cur
            cur = temp
        return prev # the new head of the reversed list

        