class GfG
{
    //Function to remove duplicates from sorted linked list.
   Node removeDuplicates(Node head)
    {
	    // Your code here
	    Node ptr = head;
	    while(ptr.next != null){
	        while(ptr.data == ptr.next.data){
	            ptr.next = ptr.next.next;
	            if(ptr.next == null){
	               return head;
	            }
	        }
	        ptr = ptr.next; 
	    }
	    return head;
    }
}
