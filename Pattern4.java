public class Pattern4 {
    /*
      1   2  3  4 5
      6   7  8  9 10
      11 12 13 14 15
      16 17 18 19 20 
      21 22 23 24 25

     */
    public static void main(String[] args) {
        int cntr=1;
        for (int row = 1;row<=5;row++ ) {
  
            for(int col=1;col<=5;col++){
                System.out.print((cntr++)+"\t");
            }
            System.out.println();            
        }
    }
}
