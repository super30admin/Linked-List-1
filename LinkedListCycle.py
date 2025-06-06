class ListNode:
    def __init__(self,val=0,next=None):
        self.val=val
        self.next=next

class Solution:
    def detectCycle(self,head:ListNode):
        slow=fast=head
    
        while fast and fast.next:
            slow=slow.next
            fast=fast.next.next
            if slow==fast:
                entry=head
                while entry!=slow:
                    entry=entry.next
                    slow=slow.next
                return entry
        return None

def buildLinkedList(values,pos):
    if not values:
        return None, []
    
    head=ListNode(values[0])
    current=head
    nodes=[head]

    for val in values[1:]:
        node=ListNode(val)
        current.next=node
        current=node
        nodes.append(node)

    if pos!=-1:
        current.next=nodes[pos]

    return head,nodes

def findNoneIndex(nodes,target_node):
    for i,node in enumerate(nodes):
        if node == target_node:
            return i
    return -1

values=[3,2,0,-4]
pos=1
head,nodes =buildLinkedList(values,pos)
sol=Solution()
cycle_node=sol.detectCycle(head)
if cycle_node:
    index=findNoneIndex(nodes,cycle_node)
    print(f"tail connects to node index{index}")
else:
    print("No Cycle")