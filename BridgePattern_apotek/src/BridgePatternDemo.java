/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 10116009_MuhamadRamdani
 */
public class BridgePatternDemo {

	public static void main(String[] args) {
		JenisObat obat1 = new Tablet(new ObatTablet());
		obat1.applyJenis();
		
		JenisObat obat2 = new Kapsul(new ObatKapsul());
		obat2.applyJenis();
                
                JenisObat obat3 = new Sirup(new ObatSirup());
		obat3.applyJenis();
	}

}