# iterative
#TC: O(n)
#SC: O(1)
"""def reverseList(self, head: ListNode) -> ListNode:
    if not head:
        return head
    node = head
    prev = None
    while node:
        temp = node.next
        node.next = prev
        prev = node
        node = temp
    return prev
    """


# recursive
#TC: O(n)
#SC: O(n)
def reverseList(self, head: ListNode) -> ListNode:
    # base
    if not head or not head.next:
        return head
    # logic
    prev = self.reverseList(head.next)
    head.next.next = head
    head.next = None
    return prev
