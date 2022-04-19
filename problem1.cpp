
// time complexity : o(n) and space is  : o(1)

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
       
        ListNode *slow  = head;
        
        ListNode*fast = head;
        bool flag = false;
        while(fast != NULL && fast->next != NULL) {
            
            slow = slow->next;
            fast  = fast->next->next;
            
            if(slow == fast) {
                flag = true;
                break;
            }
    
        }
        
        slow = head;
        if(flag) {
             while(slow != fast){
            slow = slow->next;
            fast = fast->next;
          }
        return fast;
        } else {
            return NULL;
        }  
    }
};