class Solution
{
    public:
    string reverseWord(string str)
    {
        
        string ans ="";
        stack<char>st;
        for(int i=0;i<str.length();i++){
            st.push(str[i]);
            
        }
        for(int i=0;i<str.length();i++){  
            char ch=st.top();
            ans.push_back(ch);
            st.pop();
        }
        return ans;
    }
};
