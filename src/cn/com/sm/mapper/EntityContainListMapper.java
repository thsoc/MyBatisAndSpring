package cn.com.sm.mapper;

import java.util.List;

import cn.com.sm.po.TestUser;

/**
 * 查询实例里面包含list（同一张表）
 * @author mzg
 *
 */
public interface EntityContainListMapper {
	List<TestUser> getList();
}
