package esprit.gestionOuvrages.model;

import lombok.*;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	@ToString
	public class Users extends AbstractUsersTheme<Long> {

	    @Column(nullable = false, length = 44)
	    public String name;

	    @Column(nullable = false, length = 44)
	    public String email;

	    @Column(nullable = false, length = 44)
	    public String phone;

	    @Column(nullable = false, length = 44)
	    public String address;
	    @Column(nullable = false, length = 44)
	    public String password;
	    @Column(nullable = false)
	    public Date updatepass;
	    

}
