// Time Complexity :O(n) where n in the number of nodes
// Space Complexity : O(1)  
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
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
        if(!head) return nullptr;
        set<ListNode *> hSet;
        ListNode *rPtr = head;
        while(rPtr){
            if(hSet.find(rPtr) == hSet.end())
                hSet.insert(rPtr);
            else
                return rPtr;
            rPtr = rPtr->next;
        }
        return nullptr;
    }
};