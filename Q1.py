######## Reverse a Linked List

#  Time Complexity : O(n)
#  Space Complexity :  O(1)
#  Did this code successfully run on Leetcode :  Yes
#  Any problem you faced while coding this : Initially faced issue in the while condition used fast.next instead of fast


#  using three pointers assign the values in such a manner to reverse the linked list

def reverse_list(head):
        if not head:
            return head
    
        prev = None
        curr = head
        fast = head.next

        while fast:
            curr.next = prev
            prev = curr
            curr = fast
            fast = fast.next
        curr.next = prev
        return curr
