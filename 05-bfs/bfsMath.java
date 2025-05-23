class Solution {
    public int uniquePaths(int m, int n) {
        double toplam=m+n-2;
        double sonuc=1;
        for(double i=toplam; toplam>1; toplam--){        
            m--;
            n--;
            if(m<1)
                m=1;
            if(n<1)
                n=1;
            sonuc=(toplam/(m*n))*sonuc;
        }
        return (int)Math.round(sonuc);
    }
}
