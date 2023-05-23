#TC: O(n)
#SC: O(1)
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution(object):
    def reverseList(self, head):
        
        if (head == None or head.next == None):
            return head

        prevNode = None
        currNode = head
        nextNode = head.next

        while (nextNode != None):
            currNode.next = prevNode
            prevNode = currNode
            currNode = nextNode
            nextNode = nextNode.next

        currNode.next = prevNode

        return currNode


class ReverseList_Recursive(object):
    def reverseList(self, head):
        
        if (head == None or head.next == None):
            return head

        reverseList = self.reverseList(head.next)

        head.next.next = head
        head.next = None

        return reverseList