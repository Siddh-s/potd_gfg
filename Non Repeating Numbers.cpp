 vector<int> v;
        unordered_map<int,int> mp;
        for(int i=0;i<nums.size();i++)
        {
            mp[nums[i]]++;
        }
        for(auto i:mp)
        {
            if(i.second==1)
            {
                v.push_back(i.first);
            }
        }
        sort(v.begin(),v.end());
        return v;
