package fr.sopra.pox3.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import fr.sopra.pox3.entities.MaisonDeDisque;

@Stateless
public class MaisonDeDisqueDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public MaisonDeDisque  findById (int id){
		TypedQuery<MaisonDeDisque> q = em.createQuery("from MaisonDeDisque m LEFT join fetch m.auteurs where m.id = :id " , MaisonDeDisque.class);
		q.setParameter("id", 9);
		return q.getSingleResult();
	}
	

}
