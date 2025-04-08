Binary search sıralı veri yapısı üzerinde arama yapan bir arama algoritmasıdır. 

  - Aranan veriyi, veri yapısını ikiye bölerek ortada bulunan öge yani pivot ile karşılaştırır.
  -  Pivot eğer aranan öğeye eşitse işlem bitmiştir.
  -  Pivot aranan öğeden küçükse arama işlemi verinin sol yarısında devam eder.
  -  Pivot aranan öğeden büyükse arama işlemi verinin sağ yarısında devam eder.

Buradaki kodda bu algoritmayı uyguladık:

Elimizde sıralı bir dizi var sayalım;      
  ![image](https://github.com/user-attachments/assets/0cdf42c1-0a84-43d2-9370-0ed0ac7fb4f0)


•  Burada en büyük index;9(kodda indexi bulabilmek için dizinin lengtinden 1 çıkarıyoruz) en küçük index;0. Bu da bize sağ ve sol değerlerimizi veriyor. right=9 left=0 .Aradığımız değeri 10 belirleyelim.   
•  Diziyi ortadan ikiye bölmemiz gerekiyor, bu durumda 9+0/2=4 yani 4. indexte bulunan 7 değeri bizim pivotumuz. Bakıyoruz 7>10, 7<10 bu duruma baktığımızda 7<10'dan. Yani sol taraf için arama yapmamıza gerek yok. Bu durumda left güncellenmeli. Artık yeni leftin indexi, pivot+1 olmalı. left=5 right=9    
•  Şimdi yeni pivotumuzu bulmalıyız. 5+9/2=7. 7. indexte 12 bulunuyor. 12>10 olduğuna göre bu durumda sağ tarafta artık arama yapmamıza gerek yok. Right güncellenmeli. Rightın indexi pivot-1 şeklinde bulunur. left=5 right=6    
•  Yani pivotumuz 5+6/2=5. 5. indextte 9 bulunuyor. 9<10 olduğuna göre bu seferde sol tarafta aramamız mantıksız. Left güncellenmeli; left=6 right=6    
•  Yeni pivot 6+6/2=6.  6. indexte 10 bulunuyor 10=10 olduğuna göre işlemimiz birmiştir.      
•  Ya olmayan değeri bulmak isteseydik? -2 değerini bulmak istediğimizi düşünelim bu durumda ne olurdu? Sırasıyla işlemleri yazalım   
   
   - right=9 left=0 pivot=4  7>-2 sağ taraf güncellenmeli
   - right=3 left=0 pivot=1   2>-2 sağ taraf güncellenmeli
   - right=0 left=0 pivot=0  1>-2 sağ taraf güncellenmeli
   - right=-1 left =0 dizide index -1 olamayacağına göre arama işlemi sona ermelidir.

• Dizide bulunmayan daha büyük bir sayıyı(20) ararsak;
   - right=9 left=0 pivot=4  7<20 sol taraf güncellenmeli
   - right=9 left=5 pivot=7   12<20 sol taraf güncellenmeli
   - right=9 left=8 privot=8  1<15 sol taraf güncellenmeli
   - right=9 left=9 pivot=9  16<20 sol taraf güncellenmeli
   - right=9 left=10 dizide 10. index olmadığı için göre arama işlemi sona ermelidir.

•  **Bu durumda arama işleminin devam etmesi gereken şart nedir ? Left değerimiz right değerimize ya eşit olmalı ya da küçük olmalı.**



Time complexity:O(logn)
Space complexity:O(1)



