/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
int length(struct ListNode* root)
{
    int count=0;
    struct ListNode* p;
    p=root;
    while(p!=NULL)
    {
        count++;
        p=p->next;
    }
    return count;
}
struct ListNode* removeNthFromEnd(struct ListNode* root, int k)
{
    int n,c,l;
    n=length(root);
    struct ListNode* p;
    p=root;
    if(k==n)
    {
    root=p->next;
    }
    else
    {
        struct ListNode* temp;
       l=n-k;
        c=1;
        temp=p;
        while(c<=l)
        {
            temp=p;
            c++;
            p=p->next;
        }
        temp->next=p->next;
        
    }
    return root;

}

