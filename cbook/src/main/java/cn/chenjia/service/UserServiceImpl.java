package cn.chenjia.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.chenjia.core.bean.User;
import cn.chenjia.core.bean.UserQuery;
import cn.chenjia.core.bean.UserQuery.Criteria;
import cn.chenjia.core.dao.UserDao;
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	public boolean AddUser(User user) {
		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
		System.out.println(uuid+"\n"+user.getUname()+"\n"+user.getUpassword());
		user.setUid(uuid);
		int count = userDao.insert(user);
		boolean success = false;
		if(count>0) {
			success = true;
		}
		return success;
	}

	public User UpdateUser(User user) {
		// TODO Auto-generated method stub
		UserQuery userQuery = new UserQuery();
		Criteria cri = userQuery.createCriteria();
		cri.andUnameEqualTo(user.getUname());
		return null;
	}

	public boolean DeleteUser(User user) {
		// TODO Auto-generated method stub
		UserQuery userQuery = new UserQuery();
		Criteria cri = userQuery.createCriteria();
		cri.andUidEqualTo(user.getUid());
		int count = userDao.deleteByExample(userQuery);
		boolean success = false;
		if(count>0) {
			success = true;
		}	
		return success;
	}

	public List<User> selectAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
