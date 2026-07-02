
// Approach:
// 1. Initialize two pointers: prev as null and curr as head.
// 2. Traverse the linked list while curr is not null.
// 3. Store the next node, reverse the current node's pointer,
//    then move prev and curr one step forward.
// 4. Continue until all links are reversed.
// 5. Return prev as the new head of the reversed linked list.

// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null) return head;
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
}
//problem-2
// Approach:
// 1. Create a dummy node pointing to the head to handle edge cases.
// 2. Place two pointers (fast and slow) at the dummy node.
// 3. Move the fast pointer (n + 1) steps ahead to maintain a gap of n nodes.
// 4. Move both pointers together until fast reaches the end.
// 5. The slow pointer will be just before the node to be deleted.
// 6. Remove the target node by updating the next pointer.
// 7. Return dummy.next as the updated head.

// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummynode=new ListNode(-1);
        if(head==null) return head;
        dummynode.next=head;
        int cnt=0;
        ListNode slow=dummynode;
        ListNode fast=dummynode;
        while(cnt<=n){
            fast=fast.next;
            cnt++;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        ListNode temp=slow.next;
        slow.next=slow.next.next;
        temp=null;
        return dummynode.next;
    }
}
//problem 3
// Approach:
// 1. Traverse the linked list while storing each visited node in a HashSet.
// 2. Before adding a node, check if it already exists in the set.
// 3. If it exists, that node is the starting point of the cycle.
// 4. If the traversal reaches null, no cycle exists.
// 5. Return the cycle's starting node or null if there is no cycle.

// Time Complexity: O(n)
// Space Complexity: O(n)
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> map=new HashSet<>();
        if(head==null) return head;
        ListNode curr=head;
        while(curr!=null){
            if(map.contains(curr)){
                return curr;
            }
            map.add(curr);
            curr=curr.next;
        }
        return null;
    }
}
