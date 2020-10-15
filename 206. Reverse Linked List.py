"""
Reverse a singly linked list.

Example:

Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL
Follow up:

A linked list can be reversed either iteratively or recursively. Could you implement both?
"""

# Iterative Approach
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
	#Run time Complexity : O(N)
	# Space Complexity: O(1)
    # While you are traversing the list, change the current node's next pointer to point to its previous element. Since a node does not have reference to its previous node, you must store its previous element beforehand. You also need another pointer to store the next node before changing the reference. 
        node = None
        while head:
            temp = head.next
            head.next = node
            node = head
            head = temp
        return node 
        
        
        
        
# Recursive Approach
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        #Runtime COmplexity: O(N)
        #Space Complexity: O(N)
        if (head == None or head.next == None): return head
        p = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        return p