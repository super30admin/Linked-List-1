# tc O(n), sc O(1).
sentinel = ListNode()
sentinel.next = head
first, second = sentinel, sentinel

cnt = 0
while second:
    second = second.next
    cnt += 1
    if cnt == n:
        break

while second:
    second = second.next
    prev = first
    first = first.next

prev.next = first.next
return sentinel.next