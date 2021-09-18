package com.hxc.eduservice.service;

import com.hxc.eduservice.entity.EduCourse;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hxc.eduservice.entity.EduTeacher;
import com.hxc.eduservice.entity.vo.CourseInfoVo;

import java.util.List;

/**
 * <p>
 * 课程 服务类
 * </p>
 *
 * @author testjava
 * @since 2021-01-19
 */
public interface EduCourseService extends IService<EduCourse> {
    //添加课程基本信息的方法
    String saveCourseInfo(CourseInfoVo courseInfoVo);

    CourseInfoVo getCourseInfo(String courseId);

    void updateCourseInfo(CourseInfoVo courseInfoVo);

}
