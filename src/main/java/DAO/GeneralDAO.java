package DAO;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by user on 06.03.2015.
 * General generics interface for creating DAO classes
 *
 */
public interface GeneralDAO <T>{
    /**
     * Method for getting object by it's id
     * @param id identifical number of object, which
     *           is going to be getted
     * @return  object by it's id
     * @throws SQLException
     */
    public T getObjectByID (int id) throws SQLException;

//    /**
//     * Method for getting List of all of objects,
//     * from db
//     * @return List of objects
//     */
//    public List<T> getAll();

    public void addObject (T obj) throws SQLException;

}
