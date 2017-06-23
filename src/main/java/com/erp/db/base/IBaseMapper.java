package com.erp.db.base;

/**
 * 
 * @author dev003
 *
 * @param <Entity>
 * @param <T>
 */
public interface IBaseMapper<Entity, T>
{
    public int insert(Entity entity);

    public int update(Entity entity);

    public int delete(Integer id);

    public Entity queryById(T t);
}
