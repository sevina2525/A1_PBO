/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POSTTEST6;

/**
 *
 * @author asus
 */
public class monokrom implements musik_lagu {
    static String nama_lagu = "monokrom";
    String rilis,genre;
    
    public monokrom(String rilis,String genre){
        this.rilis = rilis;
        this.genre = genre;
    }

    @Override
    public void tampil() {
        System.out.println("Nama lagu   = "+ nama_lagu);
        System.out.println("Genre       = "+ this.genre);
        System.out.println("Rilis       = "+ this.rilis);
    }

    @Override
    public void matikan() {
        System.out.println("Nama lagu   = "+ nama_lagu);
        System.out.println("Genre       = "+ this.genre);
        System.out.println("Lagu dimatikan....");//To change body of generated methods, choose Tools | Templates.
    }
    
}
