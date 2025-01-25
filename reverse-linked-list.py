# tc O(n), sc O(n).
prev = None
curr = head
while curr:
    nxt = curr.next

    curr.next = prev
    prev = curr
    curr = nxt

return prev