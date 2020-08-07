/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 10116009_MuhamadRamdani
 */
public abstract class JenisObat {
	//Composition - implementor
	protected Jenis jenis;
	
	//constructor with implementor as input argument
	public JenisObat(Jenis c){
		this.jenis=c;
	}
	
	abstract public void applyJenis();
}