/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto2_Web.repositorio;

import Reto2_Web.interfaces.InterfaceOrder;
import Reto2_Web.modelo.Order;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Usuario
 */
@Repository
public class OrderRepositorio {
    
    @Autowired
    private InterfaceOrder orderCrudRepository;

    public List<Order> getAll(){
        return (List<Order>) orderCrudRepository.findAll();
    }

    public Optional<Order> getOrder(Integer id){
        return orderCrudRepository.findById(id);
    }

    public Order create(Order order){
        return orderCrudRepository.save(order);
    }

    public void update(Order order){
        orderCrudRepository.save(order);
    }

    public void delete(Order order){
        orderCrudRepository.delete(order);
    }

    public Optional<Order> lastUserId(){
        return orderCrudRepository.findTopByOrderByIdDesc();
    }    
    
    public List<Order> findByZone(String zona) {
        return orderCrudRepository.findByZone(zona);
    }
    
}
