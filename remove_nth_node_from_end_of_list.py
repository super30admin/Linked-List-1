#Time Complexity: O(N)
#Space Complexity: O(1)

class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: Optional[ListNode]
        :type n: int
        :rtype: Optional[ListNode]
        """


        cur = head
        LL_length = self.getLength(head)

        if LL_length == 1 and n == 1:
            return None
        
        if LL_length == n:
            return head.next

        
        
        node_from_front = LL_length - n
        print(node_from_front)

        while node_from_front > 1:
            cur = cur.next
            node_from_front -= 1

        if cur.next is not None:
            cur.next = cur.next.next
        else:
            cur.next = None

        return head

    def getLength(self,head):
        count = 0
        cur = head
        while cur is not None:
            count += 1
            cur = cur.next
        return count

        