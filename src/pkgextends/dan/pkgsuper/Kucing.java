/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgextends.dan.pkgsuper;

/**
 *
 * @author FAIZ
 */
public class Kucing extends hewan{
    @Override
    public void Makan(){
        System.out.println("Kucing makan ikan");
        
    }
    
    public void Suara(){
        System.out.println("Meong.....Meong");
        
    }
    public void Aksi(){
        Makan();
        super.Makan();
        Suara();
    }
}
