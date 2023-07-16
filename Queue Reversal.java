
    public Queue<Integer> rev(Queue<Integer> q){
        //add code here.
        Stack<Integer> st = new Stack<>();
        while(q.size()!=0){
            st.push(q.remove());
        }
        while(st.size()!=0){
            q.add(st.peek());
            st.pop();
        }
        return q;
    }
