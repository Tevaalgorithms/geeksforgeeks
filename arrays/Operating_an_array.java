class GfG
{
public boolean searchEle(int a[],int x) {
		for(int i = 0; i < a.length; i++) {
		    if(x == a[i]) return true;
		}
		return false;
}  
public boolean insertEle(int a[],int y,int yi)
{
        if(yi > 0 || yi < a.length && a != null) {
            a[yi] = y;
            return true;
        }
        return false;
 }
 
 public boolean deleteEle(int a[],int z)
 {
	  if (a == null || z < 0 || z >= a.length) {   
            return false; 
     } 
  
     // Create another array of size one less 
    int[] anotherArray = new int[a.length - 1]; 
  
    // Copy the elements except the index 
    // from original array to the other array 
    for (int i = 0, k = 0; i < a.length; i++) { 
            // if the index is 
            // the removal element index 
            if (i == z) { 
                continue; 
            }   
            // if the index is not 
            // the removal element index 
            anotherArray[k++] = a[i]; 
        }   
        // return the resultant array 
        return true; 
        }
}
