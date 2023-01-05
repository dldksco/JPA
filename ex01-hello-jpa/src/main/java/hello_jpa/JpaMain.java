package hello_jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        try {
//              비영속
//            Member member = new Member();
//            member.setId(2L);
//            member.setName("HelloB");
            //영속
//            em.persist(member);
//            em.remove(findMember);삭제
//            Member findMember = em.find(Member.class, 1L);
//                findMember.setName("HelloJpa");
            List<Member> result = em.createQuery("select m from Member as m", Member.class)
                            .getResultList();
            for (Member member : result) {
                System.out.println("member.name = " + member.getName());
            }
            tx.commit();
        }catch (Exception e){
            tx.rollback();
        }finally {
        //내부적으로 connection반납
        em.close();

        }
        emf.close();

    }
}