package JavaEx.Control_Flow3;

public class Continue {

    public static void main(String[] args) {

        int i = 1, j = 1;
    
        // outer loop
        while (i <= 3) {
    
          System.out.println("Outer Loop: " + i);
    
          // inner loop
          while(j <= 3) {
    
            if(j == 2) {
              j++;
              continue;
            }
    
            System.out.println("Inner Loop: " + j);
            j++;
          }
          i++;
        }
      
    
      // outer loop is labeled as first
    first:
    for (int ii = 1; ii < 6; ++ii) {

      // inner loop
      for (int jj = 1; jj < 5; ++jj) {
        if (ii == 3 || jj == 2)

          // skips the current iteration of outer loop
          continue first;
        System.out.println("ii = " + ii + "; jj = " + jj);
      }
    }
  }

}
