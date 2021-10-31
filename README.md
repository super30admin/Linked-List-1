# Linked-List-1

## Problem1 (https://leetcode.com/problems/reverse-linked-list/)
#Time Complexity=O(n)
#Space Complexity=O(n)

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head or not head.next:
            return head
        p=self.reverseList(head.next)
        head.next.next=head
        head.next=None
        return p
        
## Problem2 (https://leetcode.com/problems/remove-nth-node-from-end-of-list/)
#Time Complexity=O(n)
#Space Complexity=O(1)
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy=ListNode(-1)
        dummy.next=head
        head=dummy
        count=1
        slow=head
        fast=head
        while count<=n and fast:
            fast=fast.next
            count+=1
        while fast.next:
            slow=slow.next
            fast=fast.next
        slow.next=slow.next.next
        return dummy.next

## Problem3 (https://leetcode.com/problems/linked-list-cycle-ii/)
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None
#Time Complexity=O(n)
#Space Complexity=O(1)
class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        slow=head
        fast=head
        while fast and fast.next:
            slow=slow.next
            fast=fast.next.next
            if slow==fast:
                break
        if not fast or not fast.next:
            return None
        p=head
        while p!=fast:
            p=p.next
            fast=fast.next
        return p

