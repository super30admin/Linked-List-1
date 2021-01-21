# Iterative
# TC: O(n), SC: O(1)
# 3 pointer basic template
class Solution:
    def reverseList(self, head):
        if head == None or head.next == None: return head
        prev, curr, fast = None, head, head.next
        while fast != None:
            curr.next = prev
            prev = curr
            curr = fast
            fast = fast.next
        curr.next = prev
        return curr

# Recursion
# TC: O(n) SC: O(n)
# Add nodes to rec stack until head.next == None. Change connections while popping out each node
class Solution:
    def reverseList(self, head):
        if head == None or head.next == None: return head
        reversed_ = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        return reversed_
        