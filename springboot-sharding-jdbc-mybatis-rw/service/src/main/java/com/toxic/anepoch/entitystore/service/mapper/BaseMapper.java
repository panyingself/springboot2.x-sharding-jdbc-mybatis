

package com.toxic.anepoch.entitystore.service.mapper;

import java.util.List;

public interface BaseMapper<T> {
    /**
     * 插入对象
     * @param var1
     * @return
     */
    int insert(T var1);

    /**
     * 删除对象
     * @param var1
     * @return
     */
    int delete(Object var1);

    /**
     * 修改对象
     * @param var1
     * @return
     */
    int update(T var1);

    /**
     * 查询单个对象
     * @param var1
     * @return
     */
    T selectOne(T var1);

    /**
     * 查询对象集合
     * @param var1
     * @return
     */
    List<T> selectList(T var1);

    /**
     * 根据条件查询总记录数
     * @param var1
     * @return
     */
    int getTotleCountByConditions(T var1);
}