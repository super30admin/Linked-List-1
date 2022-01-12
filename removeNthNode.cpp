/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
      
        
        ListNode* prev=NULL, *slow, *fast;
        
        ListNode* dummy = new ListNode(-1);
        
        dummy->next = head;
        
        head = dummy;
        fast = head;
        slow = head;
        int i = 0;
        while(i<n) {
            i++;
            fast = fast->next;
        }
        cout<<i<<endl;
        cout<<slow->val<< " "<<fast->val<<endl;
        while(fast->next!=NULL){
            
            slow = slow->next;
            fast = fast->next;
            
        }
        slow->next = slow->next->next;
        
        return head->next;
        
    }
};
