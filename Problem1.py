#Time Complexity: O(n)
#Space Complexity: O(1)
#Working on Leetcode: Yes

class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class Solution:
    def __init__(self):
        self.head = None

    def createLinkedList(self, new_data):
        new_node = Node(new_data)
        new_node.next = self.head
        self.head = new_node


    def reverseLinkedList(self):
        prev = None
        current = self.head
        while(current):
            next = current.next
            current.next = prev
            prev = current
            current = next
        self.head = prev




    def printList(self):
        while(self.head):
            print(self.head.data)
            self.head = self.head.next

    # def reverseList(self, head):
    #     pass



obj = Solution()
array_list = [1,2,3,4,5]
for i in array_list:
    obj.createLinkedList(i)

obj.printList()