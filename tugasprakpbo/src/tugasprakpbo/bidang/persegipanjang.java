/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasprakpbo.bidang;

/**
 *
 * @author MSI Bravo
 */
public class persegipanjang implements menghitungbidang{
    public int panjang;
    public int lebar;

    public persegipanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }
    
    @Override
    public double Luas(){
        return this.panjang * this.lebar;
    }
    
    @Override
    public double Keliling(){
        return 2 * (this.panjang + this.lebar);
    }
}
    

