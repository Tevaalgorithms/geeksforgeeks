class GfG
{
    public static Long product(Long arr[], Long mod, int n)
    {
        long ans1 = 1;
        
        //long long int ans2;
        for(int i=n-1; i>=0; i--){
            ans1=(ans1%mod)*(arr[i]%mod);
        }
        ans1=ans1%mod;
        return ans1;
    }
}
