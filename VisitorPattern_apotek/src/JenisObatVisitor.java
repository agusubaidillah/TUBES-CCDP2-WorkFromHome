/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 10116009_MuhamadRamdani
 */
public interface JenisObatVisitor {
	public void visit(Apotek apotek);
	public void visit(Sirup sirup);
	public void visit(Kapsul kapsul);
	public void visit(Tablet tablet);
}
