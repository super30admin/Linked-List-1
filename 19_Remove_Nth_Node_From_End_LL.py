# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

# Leetcode problem link : https://leetcode.com/problems/remove-nth-node-from-end-of-list/
# Time Complexity : O(n)
#  Space Complexity : O(1)
#  Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
'''
        Basic approach : O(2n) space => Traverse once to get the length and do length -n in the second traversal to delete the next node
    
        Optimized approach: O(n) => 1. Create a dummy head (Required for case when there is only one element in linked list)
        2. Create two pointers.
        3. First pointer will move n count before we start moving the second counter
        4. As there is a difference of n nodes between the two pointers, when the first pointer reaches the end then the second pointer is at the size-n node position so we can delete the next node
        5. Return head which is dummyhead's next node.
        
'''
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        while not head:
            return None
        dummyHead = ListNode(-1,head)
        first = dummyHead
        second = dummyHead
        count = 0
        while count <= n and first != None:
            first = first.next
            count += 1

        while first:
            second = second.next
            first = first.next
        
        second.next = second.next.next
        
        return dummyHead.next
        