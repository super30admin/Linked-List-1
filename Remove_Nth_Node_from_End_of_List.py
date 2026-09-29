# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
# We can have two approaches first is two pass where get the length of linkedlist by using count and then go to previous node of the node we want to remove.
# One Pass Approach using Two Pointers. Initialize a dummy node to 0 and dummy.next to head
# Initialize fast and slow pointers to dummy node. Update only the fast pointer by one until it reaches one node before the nth node to remove from the linkedlist
# Then update both the fast pointer and slow pointer by one until fast is null.


class Solution:
    def removeNthFromEnd(self, head: ListNode | None, n: int) -> ListNode | None:
        if not head:
            return None
        count = 0
        currentNode = head
        while currentNode:
            count += 1
            currentNode = currentNode.next

        num = count - n
        slow = head
        
        # Remove head
        if num == 0:
            return head.next

        # Move to node BEFORE the one we want to remove
        while num > 1:
            num -= 1
            slow = slow.next
        slow.next = slow.next.next

        return head
# Two pass algorithm

class Solution:
    def removeNthFromEnd(self, head: ListNode | None, n: int) -> ListNode | None:
        if not head:
            return None
        dummy = ListNode(0)
        dummy.next = head
        slow = dummy
        fast = dummy
        count = 0
        while count <= n:
            fast = fast.next
            count += 1
        
        while fast:
            slow = slow.next
            fast = fast.next
        slow.next = slow.next.next

        return dummy.next
#One pass algorithm
        