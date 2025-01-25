# tc O(n), sc O(1).
fast = slow = head

while fast and fast.next:
    fast = fast.next.next
    slow = slow.next
    if slow == fast:
        slow = head
        while slow != fast:
            fast = fast.next
            slow = slow.next
        return slow
return None