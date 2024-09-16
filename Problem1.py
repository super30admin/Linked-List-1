# Approach1:Iterative. We need to set the previous of a pointer to next. Since in singly we dont have reference to prev we store it in a separate variable and set currents next to this node.
# Time Complexity: O(n)
# Space Complexity: O(1) constant for the 2 pointer nodes
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        curr = head
        prev = None
        while curr is not None:
            currNext = curr.next  # So that we dont lose the reference of current's next
            curr.next = prev
            prev = curr
            curr = currNext  # Move to next node
        return prev  ##Now the head


##Aproach2:Recursive
#Apprach:Recursuve. Recursive call until we reach last node. Once last node is reached,
# we return the node and go to the previous node in call stack ie the previous to last node.The  head pointer will be pointing to this node now.
# We need to set the next of this node's next to current node. Therefore, head.next.next will be head.
# Keep repeating until all the nodes in call stack are done. At the end we return the head of our reversed linked list
#Time Complexity: O(n)
#Space Complexity: O(n) for recursion stack
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if head is None or head.next is None:
            return head
        p=self.reverseList(head.next)
        head.next.next=head
        head.next=None
        return p
