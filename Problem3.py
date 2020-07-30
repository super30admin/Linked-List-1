#Time Complexity: O(n)
#Space Complexity: O(1)
#Works on leetcode: yes 
#Approach: We use 2 pointer - fast and slow. The fast moves twice as fast as slow, if there is a cycle, the fast will be equal
#to slow at some point, otherwise it will exit. Once fast and slow are equal, we use temp pointer to start at head. We move
#temp and slow simultaneously untill temp==slow
class Solution(object):
    def detectCycle(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        s=f=head
        while f and f.next:
            s=s.next
            f=f.next.next
            if s == f:
                t=head
                while t != s:
                    t=t.next
                    s=s.next
                return t
        #else:
        return None