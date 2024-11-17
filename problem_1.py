# TC: O(n)
# SC: O(1)


def reverseList(head):
    node = None

    while head:
        temp = head.next
        head.next = node
        node = head
        head = temp

    return node