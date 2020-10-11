## one pass with from postion m to n
"""
Input: 1->2->3->4->5->NULL, m = 2, n = 4
Output: 1->4->3->2->5->NULL

Move pointer to next until reached to m, to traditional reverse until n pointer
break and update the pointers with original linkedlist.
Time Complexity: O(N)
Space Complexity: O(1)
"""

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseBetween(self, head: ListNode, m: int, n: int) -> ListNode:
        #base case
        if not head or not head.next: return head
        if m == n: return head
        
        # handle m == 1 case
        counter = 0
        curr = ListNode(0)
        curr.next = head
        head = curr
        
        # traverse up to the (m-1)th node
        while counter < m-1 and curr:
            counter += 1
            curr = curr.next
        
        # assign m-1th node
        frontNode = curr

        curr = curr.next    #mth node
        counter += 1
        mthNode = curr
        prev = endNode = None
        
        # start from mth node up to nth node
        while curr and counter <= n:    # do traditional reversal 
            next_node = curr.next
            curr.next = prev
            prev = curr
            curr = next_node
            if counter == n:    # when counter == n, grab the next value and break
                endNode = curr if curr else None
                break
            counter += 1
        
        # connect the reversed LL into original
        frontNode.next = prev
        mthNode.next = endNode
        
        return head.next