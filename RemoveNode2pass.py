"""
This is a O(N^2) approach since here we are finding the length of the LL first and then we are finding
the node to remove it and using next of next pointer to remove them.
Space complexity - O(1)
Leetcode - running
"""

def removeNthFromEnd(self, head, n):
        counter = head
        count = 0
        while counter:
            count += 1
            counter = counter.next
            
        if count == n:
            return head.next
        cur = head
        while cur:
            count -= 1
            print count
            if count == n:
                cur.next = cur.next.next
            cur = cur.next
        return head