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

//In the below solution we used slow and fast pointer which starts where slow increments by 1 and fast increments by 2. At one point the slow and fast pointer will meet which means that a cycle is detected. We will using a flag to mark that cycle is detected. and the logic to get the cycle point will be executed. To get the point, We start the slow from head again and increment the start and fast again. The fast will keep iterating in the cycle and slow will overlap the fast at the point where the cycle starts. 

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null)    return null;
        ListNode slow = head;
        ListNode fast = head;
        Boolean flag = false;
        while(fast != null && fast.next != null){   // Detect the cycle
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                flag = true;
                break;
            }
        }
        if(flag == true){   // Detect the node where cycle starts
            slow = head;
            while(slow != fast){
                slow = slow.next;
                fast = fast.next;
            }
        }
        else{
            return null;            // return null if no cycle is detected
        }
        return slow;                //otherwise return slow or fast
    }
}
