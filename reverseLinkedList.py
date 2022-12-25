# // Time Complexity : O(N) for both recurisive and 3 pointer
# // Space Complexity : O(N) for recursivemand O(1) for 3 pointer
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


# // Your code here along with comments explaining your approach
## We start with a prev pointing to None and curr to head. while curr assign temp to curr.next to store the lost
## connection. curr.next to prev, prev = curr and then assign curr = temp.
class solution:
    def reverse_3_pointer(self, head):

        prev = None
        curr = head

        while curr:
            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp
        
        return prev 

## we start recrusively to the next head. We check if our element is last, if it is then we return the head. 
## then we take the element and connect it reverse (head.next.next = head) and then cut the current connection.

    def reverse_recursive(self, head):

        ## base 
        if not head or head.next == None:
            return head 

        ## logic
    
        result = self.reverse_recursive(head.next)
        head.next.next = head
        head.next = None

        return result