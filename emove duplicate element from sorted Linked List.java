class Solution
{
    public:

    Node *compute(Node *head)
    {
        if(!head || !head->next) return head;
        Node *temp = head;
        
        while(temp->next != NULL)
        {
            if(temp->next->data > temp->data)
            {
                temp->data = temp->next->data;
                temp->next = temp->next->next;
                temp = head;
            }
            else
                temp = temp->next;
        }
        return head;
    }
};
