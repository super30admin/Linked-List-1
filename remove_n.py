"""
Time:O(n)
Space:O(1)
Leet: Accept
Problems: None
"""


class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        #fast and slow pointer
        leader = head
        follower = head
        i=0
        while leader.next is not None:
            #fast pointer goes ahead until it is N nodes ahead
            leader=leader.next
            if i >= n:
                #slow ptr begins following after required gap is achieved
                follower = follower.next
            i += 1
        if i+1 == n:
            #this handles condition if first node of list is the one to be removed
            return head.next
        else:
            #follower's next points to follower's next.next
            skip = follower.next
            follower.next = skip.next
            return head
