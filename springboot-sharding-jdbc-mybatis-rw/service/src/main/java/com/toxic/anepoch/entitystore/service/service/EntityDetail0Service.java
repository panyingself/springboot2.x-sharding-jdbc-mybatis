

package com.toxic.anepoch.entitystore.service.service;


import com.toxic.anepoch.entitystore.service.model.EntityDetail0;

import java.util.List;

/**
 * @author py
 * @date 2019/4
 */
public interface EntityDetail0Service extends BaseService<EntityDetail0> {
    /**
     * 根据对象条件-查询集合信息
     *
     * @param entityDetail0
     * @return
     */
    List<EntityDetail0> queryList(EntityDetail0 entityDetail0);


    /**
     * 根据对象条件-查询总记录数
     *
     * @param entityDetail0
     * @return
     */
    int queryCountByConditions(EntityDetail0 entityDetail0);
}
