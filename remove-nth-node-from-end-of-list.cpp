//Time complexity - O(n)
//Space complexity - O(n)

//This is a two pass solution with O(n) space. 
//If we use reverse linked list then it would be a 3 pass solution with O(1) space

class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        if(head == NULL) return head;
        int k=0;
        stack<ListNode*> st;
        ListNode* node,*hnode = head;
        
        while(head != NULL){
            st.push(head);
            head = head->next;
        }
        
        while(k!=n){
            node = st.top();st.pop();
            k++;
        }
        
        if(st.empty()) return node->next;
        st.top()->next = node->next;
        return hnode;
        
    }
};