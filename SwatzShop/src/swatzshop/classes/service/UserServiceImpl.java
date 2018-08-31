package swatzshop.classes.service;

import swatzshop.classes.model.*;
import swatzshop.classes.repository.*;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Transactional
	public String addUser(User user) {
		try {
			if (user != null) {
				userDao.addUser(user);
				return "success!!";
			} else {
				System.out.println("wrong input!!");
				return "invalid input!!";
			}
		} catch (Exception ex) {
			System.out.println(ex);
			return "Error!!";
		}
	}
}
