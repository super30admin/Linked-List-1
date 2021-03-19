// TC: O(N) where N are the number of nodes in the LL
// SC: O(1)

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
    // 2 pass approach
//         ListNode* head_copy = head;
//         ListNode* tail = head;
    
//         int count = 0;
//         while(head_copy!=NULL){
//             count++;
//             head_copy = head_copy->next;
//         }
//         count = count - n-1;
//         if(count < 0)return tail->next;//Corner case. IMP//Removing the first element.
//         //count < 0 is same as count ==n;
//         while(count > 0){
//             tail = tail->next;
//             count--;
//         }
        
//         ListNode* temp = tail->next->next;
//         tail->next->next = NULL;
//         tail->next = temp;
//         return head;
        
    // 1 pass approach
        ListNode* first = head;
        ListNode dummy = ListNode(-1);
        dummy.next = head;
        ListNode* second = &dummy;
        while(n!=0){
            n--;
            first = first->next;
        }
        while(first != NULL){
            first = first->next;
            second = second->next;
        }
        second->next = second->next->next;
        return dummy.next;//Very Important to return dummy.next and not head.
        //Think about the case [1],1.
     
    }
    
};