#TC: O(n)
#SC: O(1)

class Solution(object):
    def __init__(self, x):
        self.val = x
        self.next = None


class DetectCycle_Set(object):
    def detectCycle(self, head):
        
        if (head == None or head.next == None):
            return None

        nodes = set()

        currNode = head

        while (currNode != None):
            if (currNode in nodes):
                return currNode

            nodes.add(currNode)
            currNode = currNode.next

        return None


class DetectCycle_TwoPointers(object):
    def detectCycle(self, head):
        
        if (head == None or head.next == None):
            return None

        slowNode = head
        fastNode = head.next

        while (fastNode != None and fastNode.next != None):

            if (slowNode == fastNode):
                slowNode = head
                fastNode = fastNode.next
                break

            slowNode = slowNode.next
            fastNode = fastNode.next.next

        while (fastNode != None and fastNode.next != None):

            if (slowNode == fastNode):
                return slowNode

            slowNode = slowNode.next
            fastNode = fastNode.next

        return None