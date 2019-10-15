package com.example.springpracticedistribution.storage.repository.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.joda.time.DateTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author：Cheng.
 * @date：Created in 16:45 2019/10/15
 */
@Data
@Entity
@ToString(callSuper = true)
@Table(name = "order")
@EqualsAndHashCode(callSuper = true)
public class OrderEntity extends BasicEntity{

    @Id
    @SequenceGenerator(name = "order_seq",sequenceName = "order_id_seq",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_seq")
    private Long id;

    @Column(name = "customer_id", nullable = false)
    private Long customerId;

    @CreatedDate
    @Column(name = "created_time")
    private DateTime createdTime;

    @LastModifiedDate
    @Column(name = "last_modified_time")
    private DateTime lastModifiedTime;

}
