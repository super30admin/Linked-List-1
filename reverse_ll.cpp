**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
#include <stack>
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        ListNode *node = new ListNode(0) ;
        ListNode *ans = node ;
        stack <ListNode*> result ; 
        //cout << result.top() ;
        while(head != NULL){
            //cout << head -> val ; 
            result.push(head) ;
            head = head ->next ;
        }

        while(!result.empty()){
            node -> next = new ListNode(result.top() -> val) ;   
            node = node -> next ; 
            result.pop() ; 
        }

     return ans -> next ; 
    }
};
