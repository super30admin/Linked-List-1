#Problem 206. REVERSE LINKED LIST
# TIME COMPELXITY: O(N) where N denotes the number of nodes in the given linked list
# SPACE COMPLEXITY: O(N) since we are doing recursion which will be having stack logic 



# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reverseList(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        return self.helper(head,None)

    def helper(self,curr,prev):
        if curr is None:
            return prev

        temp=curr.next
        curr.next=prev
        prev=curr
        curr=temp
        return self.helper(curr,prev) 