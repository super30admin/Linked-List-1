def detectCycle(head):
    i = head
    j = head
    while j and j.next:
        i = i.next
        j = j.next.next
        if i == j:
            i = head

            while i != j:
                i = i.next
                j = j.next
            
            return j
    return None