• Sorun BFS algoritması ile çözülebilir ancak BFS algortiması ile çözersek;
 
 - Best case'de V node gezilir ve edgeler hiç gezilmez(az sayıda edge olduğu durumlar) bu durumda time complexity; O(V) -> **O(n)**
 - Worst case'de tüm nodelar ve tüm edge'ler gezilir(her düğümün diğer tüm düğümlerle bağlı olduğu durumlar) vu durumda time complexity; O(V+E) -> **O(n)**
 - Average case'de (tüm düğümler gezilir ancak kenarların sayısı nodeların sayısına yakındır) yime complexity; O(V+E) -> **O(n)**
 
 
 
• Ancak soruna bir mühendis gözü ile bakarsak aslında bu sorun bir olasılık-istatistik(tekrarlı permütasyon) sorusu olduğunu görürüz. Tekrarlı permütasyon formülü ile çözdüğümüzde time complexity; **O(1)**
