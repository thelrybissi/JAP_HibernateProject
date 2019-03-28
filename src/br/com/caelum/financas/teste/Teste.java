package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;
import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class Teste {

	public static void main(String[] args) {

		Conta conta = new Conta();
		conta.setAgencia("1010");
		conta.setBanco("Bradesco");
		conta.setNumeroConta("10000");
		conta.setTitular("Thelry");

		EntityManager em = new JPAUtil().getEntityManager();

		em.getTransaction().begin();

		conta = em.find(Conta.class, 1);

		em.remove(conta);

		em.getTransaction().commit();

		em.close();
	}

}
