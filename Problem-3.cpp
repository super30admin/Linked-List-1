// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// move fast pointers to two steps and slow pointer to one step. 
// If they coincide at the same place, assign small back to the head.
// let fast and slow pointers move one step each, if they coincide again then that's the loop beginning node.
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
    public:
        ListNode *detectCycle(ListNode *head) {
            ListNode* fast = head;
            ListNode* slow = head;
            while(fast!=NULL && fast->next!=NULL){
                fast=fast->next->next;
                slow=slow->next;
                if(slow == fast){
                    slow = head;
                    while(slow!=fast){
                        slow=slow->next;
                        fast=fast->next;
                    }
                    return slow;
                }
            }
            return NULL;
        }
    };