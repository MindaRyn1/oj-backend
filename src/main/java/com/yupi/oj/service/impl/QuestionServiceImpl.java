package com.yupi.oj.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yupi.oj.model.entity.Question;
import com.yupi.oj.service.QuestionService;
import com.yupi.oj.mapper.QuestionMapper;
import org.springframework.stereotype.Service;

/**
* @author MindaRyn
* @description 针对表【question(题目)】的数据库操作Service实现
* @createDate 2024-04-09 18:50:11
*/
@Service
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question>
    implements QuestionService{

}




