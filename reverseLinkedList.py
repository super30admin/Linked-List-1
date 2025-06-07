"""
Use three pointers: prev, curr, next.
Traverse and reverse the links one by one.
Return prev as new head.
"""
"""
Time Complexity: O(N) — All nodes visited once
Space Complexity: O(1) — Reversal in place
"""

from typing import Optional

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class reverseLinkedList:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev = None
        curr = head

        while curr:
            next_node = curr.next
            curr.next = prev
            prev = curr
            curr = next_node

        return prev

def build_linked_list(values):
    dummy = ListNode()
    curr = dummy
    for v in values:
        curr.next = ListNode(v)
        curr = curr.next
    return dummy.next

def print_linked_list(head):
    vals = []
    while head:
        vals.append(head.val)
        head = head.next
    print(vals)

if __name__ == "__main__":
    head = build_linked_list([1, 2, 3, 4, 5])
    obj = reverseLinkedList()
    reversed_head = obj.reverseList(head)
    print_linked_list(reversed_head) 
