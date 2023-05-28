# Linked-List-1

## Problem1 (https://leetcode.com/problems/reverse-linked-list/)
# Time complexcity : 0(n)
# space complexcity : 0(1)
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
            nxt = curr.next
            curr.next = prev
            prev = curr
            curr = nxt
    
        return prev


## Problem2 (https://leetcode.com/problems/remove-nth-node-from-end-of-list/)
## TIme complexcity : 0(n)
## space complexcity : 0(1)
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(0)
        dummy.next = head
        first = dummy
        second = dummy
        for i in range(n+1):
            first = first.next
        while first:
            first = first.next
            second = second.next
        second.next = second.next.next
        return dummy.next
            

## Problem3 (https://leetcode.com/problems/linked-list-cycle-ii/)
 ## TC: 0(n)
 ## SC: 0(1)
  def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        fast, slow = head, head
        while(fast and fast.next):
            fast = fast.next.next
            slow = slow.next
            if(fast == slow):
                slow = head
                while(slow is not fast):
                    fast = fast.next
                    slow = slow.next
                return slow
        return None
        