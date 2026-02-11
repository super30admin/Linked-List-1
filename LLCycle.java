// Approach : Brute force approach is to solve using hashset, such that repetition of node 
// gives the head of the cycle if exists
// Optimal Approach : solve using two pointer approach slow and fast, here slow = 1x, fast = 2x
// we can have 3x, 4x and so on speed for fast pointer as well
// here we have used the concept of rabbit and tortoise
// Time : O(2n) --> O(n), 1-n to check meet point, other n for checking equidistance
// Space : O(1) --> no extra space needed
// Code Successfully ran on leetcode

class LLCycle {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        boolean flag = false;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){ // checking the meet-point
                flag = true;
                break;
            }
        }

        if(!flag) return null;

        slow = head; // relocating slow pointer for equi-distance check

        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
        
    }
}