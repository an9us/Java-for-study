public class Kadai030403 { 
      public static void main(String[] args) { 
       int[] counts = {1,3,5,6,5,2}; 
       for (int i = 0; i < counts.length; i++) { 
        System.out.print(i+":"); 
        for(int k = 0;k < counts[i];k++){
        System.out.print("*");
        } 
        System.out.println();
      } 
    }
}