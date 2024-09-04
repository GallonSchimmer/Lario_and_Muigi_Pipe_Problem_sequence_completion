import java.util.ArrayList;


public class Kata {
  public static int[] pipeFix(int[] numbers) {
    //Pseudo
    //compare array(i) with array(i + 1)
    //if array(i + 1) !=  array(i) + 1 then add, put -> array(i + 1) =  array(i) + 1
    //else i++
    //check last number also
    
    //int arrays size cannot be changed. it has to be changed to an Arraylist or an Integer[], or look for it;

    ArrayList<Integer> numbersArrayList = new ArrayList<Integer>(numbers.length);
    
        //check array to fix and add int[] values to Integer[] values
        for(int i = 0; i < numbers.length; i++){    
           numbersArrayList.add(numbers[i]);
        }
     
          //checking values of new populated Integer[]
          for(int j = 0; j < numbersArrayList.size(); j++){
            numbersArrayList.get(j);
          }
    
    
    //step to fix the list with the missing values in the Integer[] with the new pipes--->
    
  
    //adding needed values to Integer[]--> logic for new pipes
    for(int z = 0; z < numbersArrayList.size() - 1;){
      int index = numbersArrayList.get(z).intValue();
      int indexPlusOne = numbersArrayList.get(z + 1).intValue(); 
        
      
          //check if the "next index value" is the corresponding "index value plus one"
          if(indexPlusOne != index + 1){
        
            indexPlusOne = index + 1;
              //System.out.println("z value + 1 indexValuePlusOne: " + indexPlusOne);
       
            //replace the values
            //arrlist.set(3, 30); --> replaces and add fills in between
            numbersArrayList.add((z + 1) , indexPlusOne);
  
                  //checking values of new populated Integer[]
                  for(int j = 0; j < numbersArrayList.size(); j++){
                    numbersArrayList.get(j);
                      //System.out.println("new Integer[] numbersArrayList.get(j): " + " j: " + j + " " + numbersArrayList.get(j));
                  }
          }//end of if
      z++;  
    }//end for z
    
    int[] neWintArray = new int[numbersArrayList.size()];
    
        //adding values from Integer[] to int[]--> logic for new pipes
        for(int y = 0; y < numbersArrayList.size();){
           int index = numbersArrayList.get(y).intValue();
           neWintArray[y] = index;
           y++;
        }
    
    //new int[] check
    for(int x = 0; x < neWintArray.length; x++){
      //System.out.println("x: " + x);
      }
    
  
    return neWintArray;
  }//end pipeFix method
}