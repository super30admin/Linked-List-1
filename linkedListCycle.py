"""
Use slow and fast pointers to find if a cycle exists.
If they meet, move one pointer to head and keep moving both one step.
Next wherever they meet is the start of the cycle.
"""
"""
Time Complexity: O(N) — For detecting and finding the cycle start
Space Complexity: O(1) — Constant Space
"""

from typing import Optional

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class linkedListCycle:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow = fast = head

        
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next

            if slow == fast:
                break
        else:
            return None

       
        slow = head
        while slow != fast:
            slow = slow.next
            fast = fast.next

        return slow


def build_linked_list_with_cycle(values, pos):
    nodes = [ListNode(val) for val in values]
    for i in range(len(nodes) - 1):
        nodes[i].next = nodes[i + 1]
    if pos != -1:
        nodes[-1].next = nodes[pos]
    return nodes[0]


if __name__ == "__main__":
    head = build_linked_list_with_cycle([3, 2, 0, -4], 1)
    obj = linkedListCycle()
    cycle_start = obj.detectCycle(head)
    print(cycle_start.val if cycle_start else None) #Returning node where cycle begins
