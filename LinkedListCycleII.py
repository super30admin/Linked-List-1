#Time Complexity: O(n)
# Space Complexity: O(1)
def detectCycle(self, head):
    if head==None or head.next==None:
        return None
    slow = head
    fast = head
    hasCycle = False
    while(fast.next!=None and fast.next.next!=None):
        slow = slow.next
        fast = fast.next.next
        if slow==fast:
            hasCycle = True
            break
    if hasCycle==False:
        return None
    else:
        slow = head
        while(slow!=fast):
            slow = slow.next
            fast=fast.next
        return slow