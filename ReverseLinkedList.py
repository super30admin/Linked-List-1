# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

#All TC on leetcode passed

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        #Here we keep 3 pointers cur, prev and temp. cur points to current node to be reversed, prev points to last node that was reveresed and tep points to cur's next node which is to be reversed next.
        #Time complexity - O(n)
        #space complexity - O(1)

        if not head or not head.next:
            return head
        revHead = self.reverseList(head.next)
        head.next.next = head
        head.next = None

        return revHead


#-----------------------------------OR----------------------------------------------

        prev = None
        cur = head
        
        while cur:
            temp = cur.next
            cur.next = prev
            prev = cur
            cur = temp

        return prev

        