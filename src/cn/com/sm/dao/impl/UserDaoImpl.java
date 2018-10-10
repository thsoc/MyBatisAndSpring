package cn.com.sm.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.com.sm.dao.UserDao;
import cn.com.sm.po.User;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	@Override
	public User findUserById(int id) {
		System.out.println("11111111111111111111111111111111111111111111111");
		SqlSession sqlSession = this.getSqlSession();
		User user = sqlSession.selectOne("test.findUserByid",id);
		return user;
	}

}
