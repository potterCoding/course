package com.reminis.server.service;

import com.github.pagehelper.PageHelper;
import com.reminis.server.domain.Chapter;
import com.reminis.server.domain.ChapterExample;
import com.reminis.server.dto.ChapterDto;
import com.reminis.server.mapper.ChapterMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class ChapterService {

    @Resource
    private ChapterMapper chapterMapper;

    public List<ChapterDto> list() {
        PageHelper.startPage(1,1);
        ChapterExample example = new ChapterExample();
        List<Chapter> chapters = chapterMapper.selectByExample(example);
        List<ChapterDto> chapterDtoList = new ArrayList<>(chapters.size());
        for (int i = 0,j = chapters.size(); i < j; i++) {
            Chapter chapter = chapters.get(i);
            ChapterDto chapterDto = new ChapterDto();
            BeanUtils.copyProperties(chapter,chapterDto);
            chapterDtoList.add(chapterDto);
        }
        return chapterDtoList;
    }

}
