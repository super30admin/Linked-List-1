//time complexity: O(n)
//space complexity:O(n)
//approach: using set
//solved on leetcode? yes
//problem faced? no

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
        ListNode* curr=head;
        set<ListNode*>set;
        while(curr!=NULL)
        {
            if(set.find(curr)!=set.end())
                return curr;
            set.insert(curr);
            curr=curr->next;
        }
        return NULL;
    }
};