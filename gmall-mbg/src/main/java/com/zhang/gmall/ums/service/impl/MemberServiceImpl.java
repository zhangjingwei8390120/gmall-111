package com.zhang.gmall.ums.service.impl;

import com.zhang.gmall.ums.entity.Member;
import com.zhang.gmall.ums.mapper.MemberMapper;
import com.zhang.gmall.ums.service.MemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-05
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

}
