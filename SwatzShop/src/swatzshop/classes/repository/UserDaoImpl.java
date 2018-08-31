package swatzshop.classes.repository;

import java.util.List;
import swatzshop.classes.model.User;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{
	private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
@Override
public void addUser(User user){
	try{
		if(user != null){
			Session session = this.sessionFactory.getCurrentSession();
			session.persist(user);
			System.out.println("User saved successfully, Person Details="+user);
		}
	}catch(Exception ex){
		System.out.println(ex);
	}
}
}
