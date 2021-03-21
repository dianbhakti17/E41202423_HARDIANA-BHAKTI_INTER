/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buku;

/**
 *
 * @author Dian
 */
public class Buku {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        book javabook = new book() ;
        javabook.set (60000, 100) ;
        javabook.show () ;
    }
}
        
        class book {
            int price ;
            int pages ;
            
            public void set (int price, int pages) {
                this.price = price ;
                this.pages = pages ;
        }
            
            public void show () {
                System.out.println("books information");
                System.out.println("book price : " +price);
                System.out.println("number of pages : " +pages);
            }
        }
        
    /**
     *
     */
  
       

/* private static class book {*/

    //    public book() {
    //    }

      //  private void set(int i, int i0) {
        //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //}

        //private void show() {
          //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //}
    //}
            
        

        
        
 
