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
		public class Simple extends AbstractUsersTheme<Long> {

		private static final long serialVersionUID = -5131729335500488683L;

			@Column(nullable = false)
		    public Boolean promo;

		    @Column(nullable = false, length = 40)
		    public Date enddate;

		    @Column(nullable = false, length = 40)
		    public String description;
		    


}
