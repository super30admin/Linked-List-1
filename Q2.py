######## Remove nth node from end

#  Time Complexity : O(n)
#  Space Complexity :  O(1)
#  Did this code successfully run on Leetcode :  Yes
#  Any problem you faced while coding this : made mistake in understanding the stopping condition for the fast


#  Keep two ponters fast and slow such that fast is at a distance of n ahead of slow. when we  reach the end the node after the slow is the node to be removed.

def remove_nth_node(head, n):
        if not head or n < 0:
            return None
    
        slow = head
        fast = head
        curr = 0

        while fast:
            fast = fast.next
            curr +=1

            if curr > n:
                slow = slow.next
        
        if curr+1 == n:
            head = head.next
            return head
        else:
            if slow.next:
                slow.next = slow.next.next
            else:
                slow.next = None
            return head
