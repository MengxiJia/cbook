package cn.chenjia.service;

import java.util.List;

import cn.chenjia.core.bean.User;

public interface UserService {
	public boolean AddUser(User user);
	public User UpdateUser(User user);
	public boolean DeleteUser(User user);
	public List<User> selectAllUser();

}
