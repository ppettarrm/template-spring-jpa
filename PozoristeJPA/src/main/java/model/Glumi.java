package model;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the Glumi database table.
 * 
 */
@Entity
@NamedQuery(name="Glumi.findAll", query="SELECT g FROM Glumi g")
public class Glumi implements Serializable {
	private static final long serialVersionUID = 1L;

	public Glumi() {
	}

}