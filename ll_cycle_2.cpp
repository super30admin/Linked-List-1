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
        ListNode *initial = head;
        ListNode*inters = intersection(head);
        if(inters == NULL)return NULL;
        while(initial != inters){
            initial = initial->next;
            inters = inters->next;
        }
        return inters;        
    }
private:
    ListNode* intersection(ListNode*head){
        ListNode* fast = head;
        ListNode* slow = head;
        while(fast!=NULL && fast->next!=NULL){
            fast = fast->next->next;
            slow = slow->next;
            if(fast == slow)return slow;
        }
        return NULL;
    }
};


