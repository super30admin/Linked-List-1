#Time Complexity:O(n)
#Space Complexity:O(n)
#leetcode submission:succesful
#we check each node is in the set or not if it is then we return the node as it is already visited
class Solution(object):
    def detectCycle(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
       
        h=set()
        temp=head
        while(temp is not None):
            if temp in h:
                return temp
            else:
                h.add(temp)
                temp=temp.next
        return None