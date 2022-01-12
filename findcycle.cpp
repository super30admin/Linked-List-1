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
        
        if(head == NULL) return NULL;
        
        ListNode* slow = head, *fast = head;
        bool flag = false; 
        while(true){
            
            
            if(slow->next == NULL || fast->next == NULL || fast->next->next == NULL) {
                flag = false;
                break;
            }
           
            slow = slow->next;
            fast = fast->next->next;
             if(slow == fast) {
                flag = true;
                break;
            }
            
            
        }
        if(flag == false) return NULL;
        cout<<fast->val<< " "<< slow->val;
        while(true){
            
            if(head == fast ) return head;
            
            head = head->next;
            fast = fast ->next;            
        }
        
        return NULL;
            
        
    }
};
