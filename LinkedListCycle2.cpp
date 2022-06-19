// Time Complexity - O(n) - Since we are iterating over 'n' nodes in the input list.
// Space Complexity - O(1) - Since we are just using two pointers to get to the solution
// Problems Faced - No!
// It runs on leetcode.
class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
        if(!head)
            return head;
        ListNode* fast = head;
        ListNode* slow = head;
        while(fast && fast->next){
            slow = slow->next;
            fast = fast->next->next;
            if(slow == fast){
                slow = head;
                while(slow != fast){
                    slow = slow->next;
                    fast = fast->next;
                }
                return slow;
            }
        }
            return NULL;
    }
};