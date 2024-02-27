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
    /*
    Time: O(1)
    Space: O(1)

    Do the math.
    if a is the length till the cycle head and the slow and fast meets at point b,
    b has moved a+b nodes, the fast has moved a+b+c nodes 
    a + b + c = 2(a+b) (since, fast moves at 2x speed)
    so, a = c
    So when they meet, take the one pointer to the original head, and then move both pointers one node at a time until they meet
    (they will meet after traversing a = c nodes)
    */

    ListNode* circle(ListNode* slow, ListNode* fast, bool fast_paced){
        while(fast != nullptr && fast != slow){
            slow = slow->next;
            fast = fast->next;

            if(fast!=nullptr && fast_paced)  fast = fast->next;
        }

        return fast;
        
    }
    ListNode *detectCycle(ListNode *head) {
        if(head==nullptr)  return nullptr;

        auto slow = head;
        auto fast = head->next;

        slow = circle(slow,fast,true);
        if(slow==nullptr)  return nullptr;
        fast = head;
        return circle(fast,slow->next,false);


    }
};
