package model;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the GlumiUIzvodjenju database table.
 * 
 */
@Entity
@NamedQuery(name="GlumiUIzvodjenju.findAll", query="SELECT g FROM GlumiUIzvodjenju g")
public class GlumiUIzvodjenju implements Serializable {
	private static final long serialVersionUID = 1L;

	public GlumiUIzvodjenju() {
	}

}