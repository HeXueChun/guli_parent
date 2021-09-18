package com.hxc.eduservice.service;

import com.hxc.eduservice.entity.EduChapter;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hxc.eduservice.entity.chapter.ChapterVo;

import java.util.List;

/**
 * <p>
 * 课程 服务类
 * </p>
 *
 * @author testjava
 * @since 2021-01-19
 */
public interface EduChapterService extends IService<EduChapter> {

    List<ChapterVo> getChapterVideoByCourseId(String courseId);
}
