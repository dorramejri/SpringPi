package esprit.gestionOuvrages.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
//@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
public class Admin {
	
	@Column(nullable = false, length = 40)
    public String role;

}
