# Linked-List-1

## Problem1 (https://leetcode.com/problems/reverse-linked-list/)
# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Iterative Solution
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if not head:
            return None
        prev = None
        curr = head
        fast = head.next
        while fast:
            curr.next = prev
            prev = curr
            curr = fast
            fast = fast.next
        curr.next = prev
        return curr

# Recursive Solution
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if not head or not head.next:
            return head
        newHead = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        return newHead


## Problem2 (https://leetcode.com/problems/remove-nth-node-from-end-of-list/)
# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Two pass solution
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        if not head:
            return None
        dummy = ListNode(-1)
        dummy.next = head
        curr = head
        length = 0
        while curr:
            length += 1
            curr = curr.next
        length -= n
        curr = dummy
        while length > 0:
            length -= 1
            curr = curr.next
        curr.next = curr.next.next
        return dummy.next

## Problem3 (https://leetcode.com/problems/linked-list-cycle-ii/)
# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Floyd's Cycle Detection Algorithm
class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        if not head:
            return None
        slow = head
        fast = head
        flag = False
        while fast and fast.next:
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

