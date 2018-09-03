import org.hibernate.Session;

public class MyHibernateTemplate {
    public void executeWithNativeSession(MyHibernateCallback myHibernateCallback) {
        Session session = null;
        try {
            session = getSession();
            session.beginTransaction();

            myHibernateCallback.doInHibernate(session);

            session.getTransaction().commit();
        } catch (Exception ex) {
            session.getTransaction().rollback();
        } finally {
            if (session != null){
                session.close();
            }
        }
    }

    private Session getSession() {
        return null;
    }

    public static void main(String[] args) {
        new MyHibernateTemplate().executeWithNativeSession(session -> session.save(null));
    }
}

