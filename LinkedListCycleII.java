//Problem 51: Linked List Cycle II
// Time Complexity : O(N), N stands for number of nodes in the linked list
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/* 
  Steps: 
     Bruteforce : TC:O(N), SC:O(N), n for storing nodes in the set. 
     Using Set: Traverse over the head and keep adding the traversed node in set. If the same node already exists in the set just return that node otherwise if traversal is finished, it means there is no cycle and return null.


     Optimized : TC: O(N), SC: O(1)
     Using two pointers which are slow and fast.
         1) Calculate Length of the Linked List cycle using slow and fast pointer. Here fast pointer will be moving at a pace of 2 initially.
         2) If cycle length is greater than 0, then initialise slow and fast to head again and move fast pointer k(the length of linked list) nodes ahead. Then start moving slow and fast at constant(1) pace and where both the nodes meet that is the start index/node of the cycle.
*/

class Solution51 {

    class ListNode{
        ListNode next;
        int val;

        ListNode(int val){
            this.val = val;
        }
    }

    public ListNode detectCycle(ListNode head) {
        
        //TC: O(N), SC: O(1)
        
        if(head==null) return null;
        
        //Using the concept of slow and fast pointers
        ListNode slow = head;
        ListNode fast = head;
        
        //1) Length of the Linked List cycle using slow and fast pointer
        //2) Move fast pointer k(the length of linked list) nodes ahead and then where slow and fast will meet that will be the cycle start point
        
        int cycleLen =0;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow==fast){
                cycleLen = getCycleLength(slow);
                break;
            }
        }
        
        if(cycleLen>0) return getCycleStart(head,cycleLen);
        
        return null;
    }
    
    //Finding length of the linked list cycle
    private int getCycleLength(ListNode slow){
        
        int cycleLen =1;
        ListNode curr = slow.next;
        
        while(curr!=slow){
            curr = curr.next;
            cycleLen++;
        }
        
        return cycleLen;
    }
    
    //Move fast pointer k nodes ahead which is cycle length. Then start moving slow and fast at normal/constant(1) pace and where both the nodes meet that is the start index/node of the cycle
    private ListNode getCycleStart(ListNode head, int cycleLen){
        
        ListNode fast = head;
        ListNode slow = head;
        
        while(cycleLen>0){
            fast = fast.next;
            cycleLen--;
        }
        
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow;
    }
    
    //Bruteforce: Using Set
    /*public ListNode detectCycle(ListNode head) {
        
        //TC: O(N), SC:O(N)
        if(head==null) return null;
        
        Set<ListNode> visited = new HashSet<>();
        
        ListNode curr = head;
        
        while(curr!=null){
            
            if(visited.contains(curr)) return curr;
            
            visited.add(curr);
            curr = curr.next;
        }
        
        return null;
    }*/
    
    
}