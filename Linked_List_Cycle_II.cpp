/*
Time Complexity: O(n)To go through the whole linked list) 
Space Complexity: O(1)
Did this code successfully run on Leetcode :yes
Any problem you faced while coding this : no
*/

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
        
        ListNode *slow = head;
        ListNode *fast = head;
        
        while(fast != NULL && fast->next != NULL){
            slow = slow -> next;
            fast = fast -> next -> next;
            if(slow == fast){
                break;
            }
        }
        if(fast == NULL||fast->next == NULL){
            return NULL;
        }
        ListNode* x = slow;
        ListNode* y = head;
        while(x != y){
            x = x->next;
            y = y->next;
        }
        return x;
    }
};