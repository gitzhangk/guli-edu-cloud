package com.coco.guli.service.edu.service.impl;

import com.coco.guli.service.edu.entity.Comment;
import com.coco.guli.service.edu.mapper.CommentMapper;
import com.coco.guli.service.edu.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 评论 服务实现类
 * </p>
 *
 * @author zhangke
 * @since 2020-07-10
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
