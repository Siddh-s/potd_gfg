Node * inOrderSuccessor(Node *root, Node *x)
    {

        Node *succ=NULL; 
        
        while(root!=NULL){
            if(x->data >= root->data)root=root->right;
            else {
                succ=root;
                root=root->left;
            }
        }
        return succ;
    }
