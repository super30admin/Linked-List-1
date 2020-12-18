#Time Compleity: O(n) where n is the number of nodes in the Linked List
#Space Complexity: O(n), because of use of recursion.
def reverseList(self, head):
        if head == None or head.next == None:
            return head
        reverse = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        return reverse