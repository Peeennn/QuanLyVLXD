/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DAO;

import java.util.List;

/**
 *
 * @author VINH
 * @param <EntityType>
 * @param <KeyType>
 */
public abstract class DAOInterface <EntityType, KeyType>{
    abstract public void insert(EntityType entity);

    abstract public void update(EntityType entity);

    abstract public void delete(KeyType id);

    abstract public EntityType selectById(KeyType id);

    abstract public List<EntityType> selectAll();

    abstract protected List<EntityType> selectBySQL(String sql, Object... args);
}
