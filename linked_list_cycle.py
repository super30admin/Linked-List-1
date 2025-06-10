# Time Complexity: O(n)
# Space Complexity: O(1)

class Solution:
    def detectCycle(self, head):
        tortoise = hare = head
        while hare and hare.next:
            tortoise = tortoise.next
            hare = hare.next.next
            if tortoise == hare:
                break
        if not hare or not hare.next:
            return None
        tortoise = head
        while tortoise != hare:
            tortoise = tortoise.next
            hare = hare.next
        return tortoise
