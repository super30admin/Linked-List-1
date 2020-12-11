//Time complexity = O(n)
//Space complexity = O(1)

class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
        ListNode* s = head,*f = head;
        
        if(f == NULL || f->next == NULL || f->next->next == NULL) return NULL;
        
        do{
            s = s->next;
            f = f->next->next;
            if(f == NULL || f->next == NULL || f->next->next == NULL) return NULL;
            
        }while(f!=s);
        
        while(head!=f){
            head = head->next;
            f = f->next;
        }
        
        return head;
    }
};