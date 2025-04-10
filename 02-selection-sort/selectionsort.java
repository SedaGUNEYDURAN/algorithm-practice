public class Main {
  public static void main(String[] args) {
  
	int[] dizi = {100,20,3,40,60};
    int min;
    int temp;
    for(int i=0; i<dizi.length-1; i++){
    	min=i;
   		 for(int j=i+1; j<dizi.length; j++){
         	if(dizi[min]>dizi[j]){
            	min=j;
        	}        
        }
        temp=dizi[i];
        dizi[i]=dizi[min];
        dizi[min]=temp;
    }
    
    for(int i=0; i<dizi.length; i++){
    	System.out.println(dizi[i]);
    }
    
  }
}
