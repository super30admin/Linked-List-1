#passed leetcode
#space: O(n)

class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode

        """
        if head:  # for case when empty list is sent
            return self.recursive_reve(None, head)
        # recursive

    def recursive_reve(self, prev, curr):
        if not (curr.next):
            head = curr
            curr.next = prev
            return head
        elif curr.next:
            next_node = curr.next
            curr.next = prev
        # prev = curr
        # curr=curr.next
        # if above 2 are given the self.recursive_reve(prev,curr)
        return self.recursive_reve(curr, next_node)


class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        # iterative
        if not (head):
            return None
        prev = None
        next_node = None
        current = head
        while current:
            next_node = current.next
            current.next = prev
            prev = current
            current = next_node
            # next_node = current.next
            # if current == head:
        head = prev
        return head





