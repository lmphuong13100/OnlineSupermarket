/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.eproject;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author minhp
 */
@Local
public interface PayMethodFacadeLocal {

    void create(PayMethod payMethod);

    void edit(PayMethod payMethod);

    void remove(PayMethod payMethod);

    PayMethod find(Object id);

    List<PayMethod> findAll();

    List<PayMethod> findRange(int[] range);

    int count();
    
}
