//Time Complexity :O(n) where n in the number of nodes
// Space Complexity : O(1)  
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
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
    ListNode* reverseList(ListNode* head) {
        //Sliding Pointer approach
        ListNode *p = head, *q = NULL, *r = NULL;
        while(p){
            r=q;
            q=p;
            p=p->next;
            q->next = r;
        }
        head = q;
        return head;

        //Array approach
        ListNode *first = NULL, *firstTail;
        vector<int> vec;
        if(head)
            first = head;
        else
            return head;
        while(first){
            vec.push_back(first->val);
            first=first->next;
        }
        for(int i=vec.size()-1; i>=0;i--){
            ListNode *newNode = new ListNode(vec[i]);
            if(i==vec.size() - 1){
                firstTail = newNode;
                head = firstTail;
            }
            else{
                
                firstTail->next = newNode;
                firstTail = newNode;
            }
        }
        return head;
    }
    
};