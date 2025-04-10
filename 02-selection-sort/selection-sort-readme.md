• Selection sort temel sıralama algoritmalarından biridir.   
• Algortimanın çalışma mantığı;

- Dizinin ilk indisindeki eleman bütün dizi ile karşılaştırılır ve **dizideki en küçük eleman** bulunur.
- Bulunan en küçük eleman  ile 0. indisteki eleman yer değiştirir.
- 1 . indise geçilir, 2. indisten başlanılarak karşılaştırma yapılır.
- 1 . indisteki değerden küçük değer bulunduğunda 1. indisteki değer ile en küçük değer arasındaki yer değiştilerek devam edilir.
- Bu işlem n-1 adım tekrar edilir. (n-1. indisteki eleman ile n. indisteki eleman karşılaştırıldıktan sonra n ile karşılaştırılabilecek bir n+1. indis değeri olmadığı için)

  Örnek dizi ;{100,20,3,40,60}
• n=5 eleman var. 4 adımda işlem gerçekleşir.
1. 100 ile her bir değer karşılaştırılır. 

  - i=0 j=1 100>20 min değerimiz 20 olur.
  - i=0 j=2; 20>3 min değerimiz 3 olur.
  - i=0 j=3; 3>40 olmadığı için min değerimiz değişmez.
  - i=0 j=4; 3>60 olmadığı için min değerimiz değişmez.
  - Min değeri ile 0. indisin arasında swap işlemi yapılır ve dizimiz ; {3,20,100,40,60} halini alır
2. Birinci indisteki eleman ile karşılaştırmaya başlarız.

 - i=1 j=2; 20>100 olmadığı için min değerimiz değişmiyor. 
 - i=1 j=3; 20>40 olmadığı için min değerimiz değişmiyor. 
 - i=1 j=4; 20>60 olmadığı için min değerimiz değişmiyor.

3. İkinci indisteki eleman ile karşılaştırmaya başlarız.
  
  - i=2 j=3; 100>40 min değerimiz 40 olur.
  - i=2 j=4; 40>60 olmadığı için min değerimiz değişmiyor.
  -  Min değeri ile 2. indisin arasında swap işlemi yapılır ve dizimiz ; {3,20,40,100,60} halini alır
    
4. Üçüncü indisteki eleman ile karşılaştırmaya başlarız.
   
   -  i=3 j=4; 100>60 min değerimiz 60 olur.
   -  Min değeri ile 3. indisin arasında swap işlemi yapılır ve dizimiz ; {3,20,40,60,100} halini alır
   -  Dördüncü indis ile karşılaştıracak bir değer olmadığı için karşılaştırma işlemimiz bitmiş olur. 
