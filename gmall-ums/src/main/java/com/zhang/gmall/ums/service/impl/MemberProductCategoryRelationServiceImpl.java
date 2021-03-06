package com.zhang.gmall.ums.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhang.gmall.ums.entity.MemberProductCategoryRelation;
import com.zhang.gmall.ums.mapper.MemberProductCategoryRelationMapper;
import com.zhang.gmall.ums.service.MemberProductCategoryRelationService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员与产品分类关系表（用户喜欢的分类） 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-05
 */
@Service
public class MemberProductCategoryRelationServiceImpl extends ServiceImpl<MemberProductCategoryRelationMapper, MemberProductCategoryRelation> implements MemberProductCategoryRelationService {

}
