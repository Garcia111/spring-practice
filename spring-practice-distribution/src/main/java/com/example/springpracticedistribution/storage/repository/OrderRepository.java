package com.example.springpracticedistribution.storage.repository;

import com.example.springpracticedistribution.storage.repository.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author：Cheng.
 * @date：Created in 16:46 2019/10/15
 */
public interface OrderRepository extends JpaRepository<OrderEntity,Long> , JpaSpecificationExecutor<OrderEntity> {
}
