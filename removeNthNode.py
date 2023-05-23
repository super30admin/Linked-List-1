#TC: O(n)
#SC: O(1)
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution(object):
    def removeNthFromEnd(self, head, n):
        
        if (head == None or head.next == None):
            return None

        fastNode = head
        count = 0

        while (count < n):
            fastNode = fastNode.next
            count += 1

        if (fastNode == None):
            return head.next

        slowNode = head

        while (fastNode.next != None):
            slowNode = slowNode.next
            fastNode = fastNode.next

        slowNode.next = slowNode.next.next

        return head