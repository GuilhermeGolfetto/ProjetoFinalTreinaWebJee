package br.com.treinaweb.jee.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.treinaweb.jee.dao.utils.JpaUtils;
import br.com.treinaweb.jee.models.Categoria;

public class CategoriaDao {

	public static List<Categoria> todos() {
		EntityManager em = JpaUtils.criarEntityManager();
		Query q = em.createQuery("SELECT cat FROM Categoria cat");
		@SuppressWarnings("unchecked")
		List<Categoria> categorias = q.getResultList();
		em.close();
		return categorias;
	}

	public static Categoria porId(int id) {
		EntityManager em = JpaUtils.criarEntityManager();
		return em.find(Categoria.class, id);
	}

	public static void inserir(Categoria categoria) {
		EntityManager em = JpaUtils.criarEntityManager();
		em.getTransaction().begin();
		em.persist(categoria);
		em.getTransaction().commit();
		em.close();
	}

	public static void atualizar(Categoria categoria) {
		EntityManager em = JpaUtils.criarEntityManager();
		em.getTransaction().begin();
		em.merge(categoria);
		em.persist(categoria);
		em.getTransaction().commit();
		em.close();
	}

	public static void excluir(Categoria categoria) {
		EntityManager em = JpaUtils.criarEntityManager();
		em.getTransaction().begin();
		em.merge(categoria);
		em.remove(categoria);
		em.getTransaction().commit();
		em.close();
	}
}
