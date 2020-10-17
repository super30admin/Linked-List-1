#time complexity O(n)
#Space Complexity O(1)
#both approach tried on leetcode and accepted
#iterative
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        #Initialize previous node as none
        prev_node = None 
        #initialise current node as head
        curr_node = head
        while curr_node:
            #storing the next node
            next_node = curr_node.next 
            #reversing the node #first time will be None
            curr_node.next = prev_node
            #the previous node now points to curr_node which will be used in next iteration
            prev_node = curr_node
            #change curr_node as next node in the original list(i.e; if it was 1 now it is 2)
            curr_node = next_node
        #head = prev_node
        return prev_node

#recursive
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        #check if the list is empty or contains only 1 element return the element
        if not head or not head.next:
            return head
        #call the function recurively for every element
        rev = self.reverseList(head.next)
        #this step sets the last elements next to curr element 
        head.next.next = head
        #and makes current elements next null (Thus reversing it)
        head.next = None
        return rev