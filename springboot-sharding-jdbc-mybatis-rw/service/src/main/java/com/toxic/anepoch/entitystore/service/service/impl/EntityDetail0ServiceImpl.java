

package com.toxic.anepoch.entitystore.service.service.impl;

import java.util.List;

import com.toxic.anepoch.entitystore.service.mapper.EntityDetail0Mapper;
import com.toxic.anepoch.entitystore.service.model.EntityDetail0;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.toxic.anepoch.entitystore.service.service.EntityDetail0Service;

/**
 * @author py
 * @date 2019/4
 */
@Service
public class EntityDetail0ServiceImpl extends BaseServiceImpl<EntityDetail0> implements EntityDetail0Service {
	@Autowired
	private EntityDetail0Mapper entityDetail0Mapper;

	/**
	 * 根据对象条件-查询集合信息
	 *
	 * @param entityDetail0
	 * @return
	 */
	public List<EntityDetail0> queryList(EntityDetail0 entityDetail0) {
		return entityDetail0Mapper.selectList(entityDetail0);
	}

	/**
	 * 根据对象条件-查询总记录数
	 *
	 * @param entityDetail0
	 * @return
	 */
	public int queryCountByConditions(EntityDetail0 entityDetail0) {
		return 0;
	}
}
