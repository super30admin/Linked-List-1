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
        if (head == NULL){
            return NULL ; 
        }
        ListNode *slow  = head; 
        ListNode *fast  = head;
        bool hasCycle = false ; 

        while(fast != NULL && fast -> next != NULL){
            fast = fast-> next ->next ; 
            slow = slow -> next ; 
            if (slow == fast){
                hasCycle = true ; 
                break ; 
            }
        }

        if(!hasCycle){
            return NULL ; 
        }

        fast  = head ; 
        while(slow != fast){
            fast = fast -> next ; 
            slow = slow -> next ; 
        }

        return slow ; 
    }
};
