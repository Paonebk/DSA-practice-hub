class CheckPrime {
    public int countPrimes(int n) {
        if(n<=2)return 0;
        boolean[] composite = new boolean[n];
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(composite[i]==false){
                for(int j=i*i;j<n;j=j+i){
                    composite[j]=true;
                }
            }
        }
        int count=0;
        for(int i=2;i<n;i++){
            if(composite[i]==false)count++;
        }
        return count;
    }
}