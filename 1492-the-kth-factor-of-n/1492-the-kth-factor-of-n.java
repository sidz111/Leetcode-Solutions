class Solution {
    public int kthFactor(int n, int k) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i=1; i<=n; i++){
            if(n%i==0){
                al.add(i);
            }
        }
        if(al.size()<k){
            return -1;
        }
        else{
        return al.get(k-1);
        }
    }
}