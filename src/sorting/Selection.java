/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author tituo4996
 */
public class Selection 
{
    public int linear(int[] n, int find){
        for (int i = 0; i < n.length; i++){
            if(n[i]== find)
                return i;
            else if(n[i]> find)
                return -1;
        }
        return -1;
    }
    
    public int binarySearch(int[] n, int find, int start, int end){
        if(start > end)
            return -1;
        
        int mid=(end-start)/2;
        
        if(n[mid]==find)
            return mid;
        else if(n[mid] > find)
            return binarySearch(n, find, start, mid-1);
        else
            return binarySearch(n, find, mid+1, end);
    }
    
    public static void main(String[] args){
        
    }
}
