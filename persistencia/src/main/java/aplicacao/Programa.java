package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		//Adicionando pessoas manualmente
		//Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		//Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com");
		//Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("va-jpa");
		EntityManager em = emf.createEntityManager();
		
		//em.getTransaction().begin(); //Adicionando pessoas ao banco de dados
		//em.persist(p1);
		//em.persist(p2);
		//em.persist(p3);
		//Pessoa p = em.find(Pessoa.class, 2); //Pesquisa manual 
		//System.out.println(p);
		//em.remove(p); //Remove a pessoa buscada
		//em.getTransaction().commit();
		
		System.out.println("Sucesso!");
		em.close();
		emf.close();
		
		
		//System.out.println(p1);
		//System.out.println(p2);
		//System.out.println(p3);
	}
}