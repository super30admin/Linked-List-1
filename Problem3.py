#Did it run on Leetcode:Yes
##Approach 1 using hashset:
#Time Complexity:O(n), n is number of nodes
#Space complexity:O(n), for n nodes stored in hashset
# In hashset maintain nodes visited. If while traversing we find a nide thats present in our set already, then that node is visited.
class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        visited = set()

        node = head
        while node is not None:
            if node in visited:
                return node
            else:
                visited.add(node)
                node = node.next

        return None


##Approach 2: Without using extra space-fast and slow ptr:
#Time Complexity:O(n), n is number of nodes
#Space complexity:O(1), we are only using 4 ptrs-constant space.
#Approach:  Use fast and slow pointer. If fast and slow pointer end up at the same node,
# there is a cycle in the linked list. Since in acyclic linked list fast will keep approaching till the end and will terminate before slow even reaches the end.
#By using fast and slow pointer we find the intersection point of 2 in the cycle.
#This intersection point can be used to detect start of cycle.
#Distance travelled by slow will be from start of linked list to start of cycle(F)_+start of cycle to point of intersection(a)=F+a
#Distance travelled by fast will be F+a+ remianing of cycle+ start of cycle to intersection=F+a+b+a
#Solving this we get F=b. Therefore 2 pointers from start of linked list and intersection will travel same distance to meet at start of cycle

class Solution:
    def getIntersection(self,head):
        fast=head
        slow=head
        while fast is not None and fast.next is not None:
            slow=slow.next
            fast=fast.next.next
            if fast==slow:
                return slow
        return None
    def detectCycle(self, head: ListNode) -> ListNode:
        if head is None:
            return None
        intersection=self.getIntersection(head)
        if intersection is None:
            return None
        ptr1=head
        ptr2=intersection
        while ptr1!=ptr2:
            ptr1=ptr1.next
            ptr2=ptr2.next
        return ptr1

