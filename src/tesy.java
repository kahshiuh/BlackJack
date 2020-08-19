
public class tesy {
   
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        for(int j = 1; j < arr.length; j++){
            int insertItem = arr[j];
            int k = j -1;
            while(k >= 0 && insertItem < arr[k]){
                arr[k+1] = arr[k];
                k--;
            }
            arr[k+1] = insertItem;
            if(j == 2){
                for(int i : arr){
                    System.out.println(i);
                }
            }
        }
    }
   
    
  
   
}
