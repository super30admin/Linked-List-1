// Using HashSet
// Time Complexity - O(n) where n is the number of nodes in Linked List
// Space Complexity - O(n)  where n is the number of nodes in Linked List
// This Solution using HashSet worked on LeetCode

// I used HashSet to keep record of unique nodes, and return the node where cycle occured otherwise return null if cycle does not occur.
public class Solution {
    public ListNode detectCycle(ListNode head) {
    HashSet<ListNode> hash = new HashSet<>();
    ListNode ptr = head;
        while(ptr != null){
            if(hash.contains(ptr)){
                return ptr;
            }
            else{
                hash.add(ptr);
            }
            ptr = ptr.next;
        }
        return null;
    }
}

// HashSet will have space complexity of O(n) below solution will be solved in O(1) constant space using slow and fast pointer

// Time Complexity - O(n)  where n is the number of nodes
// Space Complexity - O(1)  since we are not using any new data structure 
// This solution worked on LeetCode
