package com.liyi.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.liyi.cms.pojo.User;

public interface BaseDao<T> {
	//查询 模糊
	List<User> select(User user);
	
	//回显 查询一条数据
	User selectById(Integer id);
	
	//添加
	int insert(User user);
		
	//修改
	int update(User user);
		
	//删除
	int delete(@Param("ids")String ids);
}
