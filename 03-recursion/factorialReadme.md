• **Recursively(özyinelemeli)**; Problemi daha küçük alt parçalara bölerek çözme yöntemidir.  Fonksiyonun kendisini çağırması ile sağlanır. Her çağrı için stacke frame eklenir. Fazla çağrı olduğunda stack overflow hatası ile karşılaşırız. Her recursive çağrıda, önceki çağrıların yürütme durumu stacktedir. Fonksiyon tamamlandığında; stack, frameleri birer birer kaldırır ve geri dönüş işlemlerini yapar.
• Faktöriyel hesabı yaparken n değerimiz 5;

 - Main metotunda factorial(5) çağrısı yapılır ve stack'e eklenir.
 - factorial metodunda 5 * factorial(5-1) işlemi yapılır. Ancak metot çağrısı olduğu için işlem yapılmaz çağrı yapılır ve stacke eklenir çağrı.
 - 5 * 4 * factorial(4-1) durumuna ulaştık, işlem yapılmaz çağrı yaplır stack'e eklenir.
 - 5 * 4 * 3 * factorial(3-1) durumuna ulaştık,  işlem yapılmaz çağrı yaplır stack'e eklenir.
 - 5 * 4 * 3 * 2 * factorial(2-1) durumuna ulaştık,  işlem yapılmaz çağrı yaplır stack'e eklenir. 
 - 2-1 değeri 1 aldığı için çağrıdan 1 değeri döner ve stack'ten çıkar.
 - 5 * 4 * 3 * 2 * factorial(2-1) -> 5 * 4 * 3 * 2 * 1 işleminde 2 * 1=2 işlemi yapılır ve sonucu döndürür, stackten çıkar. 
 - 5 * 4 * 3 *factorial(3-1) ->5 * 4 * 3 * 2 işleminde 3 * 2=6 işlemi yapılır  ve sonucu döndürür, stackten çıkar.
 - 5 * 4 * factorial(4-1) -> 5 * 4 * 6 işleminde 4 * 6=24 işlemi yapılır  ve sonucu döndürür, stackten çıkar.
 -  5 * factorial(5-1) -> 5 * 24=120 işlemi yapılır ve sonucu döndürür, stackten çıkar.
