package com.zhang.gmall.oms.service.impl;

import com.zhang.gmall.oms.entity.Order;
import com.zhang.gmall.oms.mapper.OrderMapper;
import com.zhang.gmall.oms.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-05
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
