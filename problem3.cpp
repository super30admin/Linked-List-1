// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// We first use slow and fast pointers to check if there is a cycle -> if they meet, there is a cycle
// Once we confirm there is a cycle, reset slow and keep fast where it was, then start moving both ptrs at the same speed
// The point where they meet is the head of the cycle

class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
        bool flag = false;
        ListNode* fast = head;
        ListNode* slow = head;
        while(fast && fast->next) {
            slow = slow->next;
            fast = fast->next->next;
            if(slow == fast) {
                flag = true;
                break;
            } 
        }
        if(!flag) return nullptr;

        slow = head;
        while(slow != fast) {
            slow = slow->next;
            fast = fast->next;
        }

        return slow;
    }
};