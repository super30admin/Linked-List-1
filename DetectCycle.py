"""
The approach here is to use floyd's algorithm. we use two pointers fast and slow. fast takes 2 jumps
and slow takes 1  jump. and if the LL is cylic then at the one step before the cylic point the two pointer will meet at a particular
instance then using this now make the fast pointer move one more jump faster and move head and fast pointer
when the fast and head pointer meet we get the node from where the LL is cylic.

Time comlexity - ?
Space complexity - O(1)
leetcode - running
"""

def DetectCycle(self,head):
    fast = slow = head
    while fast and fast.next:
        fast = fast.next.next
        slow = slow.next
        if slow == fast:
            while head:
                if head == fast:
                    return head
                head = head.next
                fast = fast.next
    return None
