/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 10116009_MuhamadRamdani
 */
public class Kapsul extends JenisObat{

	public Kapsul(Jenis c) {
		super(c);
	}

	@Override
	public void applyJenis() {
		System.out.print("Obat Kapsul -> ");
		jenis.applyJenis();
	} 

}