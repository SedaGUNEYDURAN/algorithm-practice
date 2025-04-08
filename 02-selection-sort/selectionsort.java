public class Main {
  public static void main(String[] args) {
  
   // int[] dizi = {100, 20, 3, 40, 60}; 
 int[] dizi = {5, 3, 2, 8, 6};
    int min;
    for(int i=0; i<dizi.length-1; i++){
    	min=dizi[i];
   		 for(int j=i+1; j<dizi.length; j++){
         	if(min>dizi[j]){
            System.out.println("min:"+min+"dizi[j]:"+dizi[j]);
            	min=dizi[j];
                dizi[j]=dizi[i];
                dizi[i]=min;
        	}        
        }

    }
    
    for(int i=0; i<dizi.length; i++){
    	System.out.println(dizi[i]);
    }
    
  }
}
