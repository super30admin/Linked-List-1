//TC: O(n)
//SC: O(1)

//approach: move the fast pointer by 2 increment and slow by 1
//once they meet at a point, make one of the points to the head and increment each by 1 unless they meet together



public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null)
            return null;
        boolean flag = false;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){ //since in case of odd and even number of nodes
            slow = slow.next;
            fast= fast.next.next;
            if(slow==fast){
                flag = true;
                break;
            }       
        }
        if(flag==false)
            return null;
        slow = head;
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }
            return slow;
    }
}


//BruteForce: 
//Tc:O(n)
//sc:O(n)
// store the node in the map
public class LinkedList_cycle2 {
    public class Solution {
        public ListNode detectCycle(ListNode head) {
            HashSet<ListNode> map = new HashSet<>();
            ListNode curr = head;
            //int index =-1;
            while(curr!=null && !map.Contains(curr)){
                map.put(curr);
                curr = curr.next;
            }
            return curr;
        }
    }
}
