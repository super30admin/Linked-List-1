# Did this code successfully run on Leetcode: Yes
# Time Complexity: O(n)
# Space Complexity: O(1)
# Logic: keep 2 pointers, like tortoise & hare, increment T by 1 & H by 2 & see if they ever meet or not. If yes then
# there is a cyclicity else not. If cyclic then start a new pointer from head & one from previous intersection, now
# where ever they intersect is the initial intersection point.

class Solution:
    def detectCycle(self, head):
        p = head
        q = head
        r = head
        if not head or not head.next:
            return None
        while q and q.next:
            p = p.next
            q = q.next.next
            if p == q:
                break
        pos = 0
        while r and p:
            if r == p:
                return r
            r = r.next
            p = p.next
            pos += 1
        return None
