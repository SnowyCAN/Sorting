/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author tituo4996
 */
public class Sorting {

    
    public void bubbleSort(int[] n){
        boolean swapped = false;
        do{
            swapped = false;
            int temp;
            int j=n.length;
            for (int i = 0; i < j; i++){    
                if (n[i] > n[i+1]){
                    temp = n[i];
                    n[i]=n[i+1];
                    n[i+1]=temp;
                    swapped=true; 
                }       
            }
        } while (swapped);
    }
    
    public void selectionSort(int[] n){
        for (int i = 0; i < n.length-1; i++){
            int smallest =i;
            for (int j = i+1; j < n.length; j++){
                if (n[j] < n[smallest]){
                    smallest = j;
                }
            }
            int temp = n[i];
            n[i] =n[smallest];
            n[smallest]=temp;
        }
    }
    
    public void insertionSort(int[] n){
        for (int i = 1; i < n.length; i++){
            for (int j = i; j >0 && n[j]<n[j-1]; j--){
                //swap
                int temp=n[j];
                n[j]=n[j-1];
                n[j-1]=temp;
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Sorting test= new Sorting();
        int[] n={24,1,5,23,87,13,2};
        test.insertionSort(n);
        //check if sorted
        for (int i = 0; i < n.length; i++){
            System.out.println(n[i]);
        }
    }
}
