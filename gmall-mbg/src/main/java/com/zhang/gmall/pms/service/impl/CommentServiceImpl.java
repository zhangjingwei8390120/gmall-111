package com.zhang.gmall.pms.service.impl;

import com.zhang.gmall.pms.entity.Comment;
import com.zhang.gmall.pms.mapper.CommentMapper;
import com.zhang.gmall.pms.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品评价表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-05
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
