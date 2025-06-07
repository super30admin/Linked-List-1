"""
Use dummy node to simplify edge cases
Use first and second, move first n+1 steps
Then move both until first is None, and skip target node
"""
"""
Time Complexity: O(N) — Single pass
Space Complexity: O(1) — Constant space
"""

from typing import Optional

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class removeNthFromEnd:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(0, head)
        first = second = dummy

       
        for _ in range(n + 1):
            first = first.next

        
        while first:
            first = first.next
            second = second.next

   
        second.next = second.next.next
        return dummy.next


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
    obj = removeNthFromEnd()
    new_head = obj.removeNthFromEnd(head, 2)
    print_linked_list(new_head)  
