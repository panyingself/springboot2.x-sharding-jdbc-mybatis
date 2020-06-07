


package com.toxic.anepoch.entitystore.service.service.impl;

import com.toxic.anepoch.entitystore.service.mapper.BaseMapper;
import com.toxic.anepoch.entitystore.service.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * @author py
 * @date 2018/11/26 3:52 PM.
 */
public abstract class BaseServiceImpl<T> implements BaseService<T> {
    @Autowired
    private BaseMapper<T> baseMapper;

    public BaseServiceImpl() {
    }


    /**
     * 保存对象方法
     *
     * @param var1
     * @return
     */
    public boolean save(T var1) {
        return baseMapper.insert(var1) > 0;
    }

    /**
     * 根据对象条件-删除方法
     *
     * @param var1
     * @return
     */
    public int delete(T var1) {
        return baseMapper.delete(var1);
    }

    /**
     * 根据对象条件-编辑方法
     *
     * @param var1
     * @return
     */
    public boolean edit(T var1) {
        return baseMapper.update(var1) > 0;
    }

    /**
     * 根据对象条件-查询单个对象方法
     *
     * @param var1
     * @return
     */
    public T findOne(T var1) {
        return baseMapper.selectOne(var1);
    }
}