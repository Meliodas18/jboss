package ejb;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DVD.class)
public abstract class DVD_ {

	public static volatile SingularAttribute<DVD, Date> date;
	public static volatile SingularAttribute<DVD, Realisateur> realisateur;
	public static volatile SingularAttribute<DVD, Float> prix;
	public static volatile SingularAttribute<DVD, String> titre;
	public static volatile SingularAttribute<DVD, Long> id;
	public static volatile SingularAttribute<DVD, Integer> quantite;
	public static volatile SingularAttribute<DVD, Auteur> auteur;

}

