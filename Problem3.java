// ## ## Problem3 (https://leetcode.com/problems/linked-list-cycle-ii/)

// Time Complexity : 2-pointers - O(N)
// Space Complexity : 2-pointers - O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    // Use a set of nodes, once a node repeats we found a cycle
// Time - O(N), where N is the number of nodes
// SSpace - O(N), where N is the number of nodes
private ListNode bruteForce(ListNode head){
    Set<ListNode> nodeSet = new HashSet<>();

    ListNode itr=head;
    while(itr!=null){
        if(nodeSet.contains(itr)){
            // Cycle found at itr
            return itr;
        }else{
            nodeSet.add(itr);
        }
        itr=itr.next;
    }

    // No cycle
    return null;
}

// Slow and fast pointer, will meet in cycle
// Reset them, and move at same speed, will meet at the point where cycle starts
// Time - O(N)
// Space - O(1)
private ListNode twoPointers(ListNode head){
    ListNode slow=head, fast=head;

    // Pass 1 - Detect cycle
    boolean hasCycle=false;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;

        if(slow==fast){
            // cycle found
            hasCycle=true;
            break;
        }
    }

    if(!hasCycle)   return null;

    // Pass 2 - Find head of cycle
    fast=head;
    while(fast!=slow){
        fast=fast.next;
        slow=slow.next;
    }

    return fast;
}


public ListNode detectCycle(ListNode head) {
    //return bruteForce(head);
    return twoPointers(head);
}
}