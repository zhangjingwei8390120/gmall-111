package com.zhang.gmall.oms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhang.gmall.oms.entity.OrderSetting;
import com.zhang.gmall.oms.mapper.OrderSettingMapper;
import com.zhang.gmall.oms.service.OrderSettingService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单设置表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-05
 */
@Service
public class OrderSettingServiceImpl extends ServiceImpl<OrderSettingMapper, OrderSetting> implements OrderSettingService {

}
