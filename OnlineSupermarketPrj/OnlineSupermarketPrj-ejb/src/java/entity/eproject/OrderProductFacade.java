/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.eproject;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author minhp
 */
@Stateless
public class OrderProductFacade extends AbstractFacade<OrderProduct> implements OrderProductFacadeLocal {

    @PersistenceContext(unitName = "OnlineSupermarketPrj-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OrderProductFacade() {
        super(OrderProduct.class);
    }
    
}
