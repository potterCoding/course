package com.reminis.server.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.reminis.server.domain.Section;
import com.reminis.server.domain.SectionExample;
import com.reminis.server.dto.SectionDto;
import com.reminis.server.dto.PageDto;
import com.reminis.server.mapper.SectionMapper;
import com.reminis.server.util.CopyUtil;
import com.reminis.server.util.UuidUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class SectionService {

    @Resource
    private SectionMapper sectionMapper;

    /**
     * 大章列表查询
     * @param pageDto
     */
    public void list(PageDto pageDto) {
        PageHelper.startPage(pageDto.getPage(),pageDto.getSize());
        SectionExample example = new SectionExample();
        List<Section> sections = sectionMapper.selectByExample(example);
        PageInfo<Section> pageInfo = new PageInfo<>(sections);
        pageDto.setTotal(pageInfo.getTotal());

        List<SectionDto> sectionDtoList = CopyUtil.copyList(sections, SectionDto.class);
        pageDto.setList(sectionDtoList);
    }

    /**
     * 保存大章信息
     * @param sectionDto
     */
    public void save(SectionDto sectionDto) {
        Section section = CopyUtil.copy(sectionDto, Section.class);
        if (StringUtils.isEmpty(sectionDto.getId())) {
            insert(section);
        } else {
            update(section);
        }
    }

    private void insert(Section section) {
        section.setId(UuidUtil.getShortUuid());
        sectionMapper.insert(section);
    }

    private void update(Section section) {
        sectionMapper.updateByPrimaryKey(section);
    }

    /**
     * 根据id删除大章信息
     * @param id
     */
    public void delete(String id) {
        sectionMapper.deleteByPrimaryKey(id);
    }
}
