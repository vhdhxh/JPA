import entitiy.Member;
import entitiy.Team;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class jpamain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();


       tx.begin();
        Team team = new Team();
        team.setName("토트넘");
//        em.persist(team);


        Member member = new Member();
        member.setName("학생");
        member.setTeam(team);
        System.out.println("====");
        Member member1 = em.find(Member.class,1);
        System.out.println("====");
        em.persist(member);
        em.flush();
//        System.out.println(member1.getName());














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
