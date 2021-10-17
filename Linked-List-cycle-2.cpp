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
        
        if(! head) return NULL;
        if(!head->next) return NULL;
    
        ListNode * slow = head;
        ListNode * fast = head;
        
        while(fast && fast->next){
            
            fast = fast->next->next;
            slow = slow->next;
            
            if(fast == slow) break;
            
        }
        
        if(fast == slow){
            ListNode * temp = head;
            while(temp!=slow){
                temp = temp->next;
                slow = slow->next;
            }
            
            return slow;
        }
        
        return NULL;
        
    }
};

// Time Complexity: o(n) + o(z) where z is the start of the cycle and n is the number of nodes
// Sapce Complexity: o(1)
