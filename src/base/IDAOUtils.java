/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import java.util.List;

/**
 *
 * @author TKien-BKsoft
 */
public interface IDAOUtils < type, idType>   {
   
    public List<type> getList(String conditions);
    
    public type getById(idType id);
    
    public boolean add(type object);
    
    public boolean update(type object);
    
    public boolean delete(idType id);
    
    
}
