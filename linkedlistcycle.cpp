/**
 * TC - O(n)
 * SC - O(1)
*/
class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
        ListNode* fastPointer = head;
        ListNode* slowPointer = head;

        if(fastPointer!= NULL && fastPointer->next !=NULL){
            fastPointer = fastPointer->next->next;
            slowPointer = slowPointer->next;
        }

        while(fastPointer!= NULL && fastPointer->next !=NULL  && fastPointer != slowPointer){
            fastPointer = fastPointer->next->next;
            slowPointer = slowPointer->next;
        }
        if(fastPointer==NULL || fastPointer->next ==NULL) return NULL; // no cycle

        cout<<slowPointer->val<<endl;
        cout<<fastPointer->val<<endl;


        slowPointer =head;
        while( fastPointer != slowPointer) {

            fastPointer = fastPointer->next;
            slowPointer = slowPointer->next;
            cout<<slowPointer->val<<endl;
            
        }

        return fastPointer;
    }
};