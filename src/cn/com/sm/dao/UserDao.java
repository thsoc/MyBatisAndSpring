package cn.com.sm.dao;

import cn.com.sm.po.User;

/**
 * 用户管理的接口
 * @author 20721
 *
 */
public interface UserDao {
	public User findUserById(int id);
}
