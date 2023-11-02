package model;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the Glumac database table.
 * 
 */
@Entity
@NamedQuery(name="Glumac.findAll", query="SELECT g FROM Glumac g")
public class Glumac implements Serializable {
	private static final long serialVersionUID = 1L;

	public Glumac() {
	}

}