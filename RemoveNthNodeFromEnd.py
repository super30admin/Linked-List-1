#Time Complexity: O(n)
#Space Complexity: O(1)
def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
    current = head
    count = 0
    count1 = 0
    while(current!=None):
        count = count + 1
        current = current.next
    current = head
    length = count - n
    if length==0:
        return head.next
    while(current.next!=None):
        count1 = count1 + 1
        if length==count1:
            current.next = current.next.next
            return head
        current = current.next
        