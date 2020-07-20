/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    List<Integer> li;
    ListNode root =null;
    Solution()
    {
        li = new ArrayList<>();
    }
    void add(ListNode head)
    {
        ListNode p = head;
        while(p!=null)
        {
            li.add(p.val);
            p = p.next;
        }
    }
    void append(int n)
    {
        ListNode temp = new ListNode(n,null);
        if(root==null)
        {
            root=temp;
            return;
        }
        ListNode p =root;
        while(p.next!=null)p = p.next;
        p.next = temp;
    }
    public ListNode reverseKGroup(ListNode head, int k) 
    {
        add(head);
        int n = li.size();
        for(int i=0;i<n;i+=k)
        {
            if(n>i+k-1)
                for(int j=i+k-1;j>=i;j--)
                    append(li.get(j));
        }
        if(n%k!=0)
        for(int i=n-(n%k);i<n;i++)
            append(li.get(i));
        return root;
    }
}