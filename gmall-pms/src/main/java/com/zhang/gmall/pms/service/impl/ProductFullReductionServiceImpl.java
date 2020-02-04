package com.zhang.gmall.pms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhang.gmall.pms.entity.ProductFullReduction;
import com.zhang.gmall.pms.mapper.ProductFullReductionMapper;
import com.zhang.gmall.pms.service.ProductFullReductionService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品满减表(只针对同商品) 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-05
 */
@Service
public class ProductFullReductionServiceImpl extends ServiceImpl<ProductFullReductionMapper, ProductFullReduction> implements ProductFullReductionService {

}
