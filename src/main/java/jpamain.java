import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class jpamain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        Member member = new Member();
       tx.begin();
        member.setName("학생");
        em.persist(member);


        Member member1 = em.find(Member.class,1L);

        em.flush();

        tx.commit();
        em.close();
//        em.persist(member);
//        Member student = em.find(Member.class , member.getName());



//        Member member = new Member();
//        member.setStudent("studnet1");
//        tx.begin();
//        em.persist(member);
//        tx.commit();


    }
}
