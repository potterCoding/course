package com.reminis.server.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.reminis.server.domain.${Domain};
import com.reminis.server.domain.${Domain}Example;
import com.reminis.server.dto.${Domain}Dto;
import com.reminis.server.dto.PageDto;
import com.reminis.server.mapper.${Domain}Mapper;
import com.reminis.server.util.CopyUtil;
import com.reminis.server.util.UuidUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class ${Domain}Service {

    @Resource
    private ${Domain}Mapper ${domain}Mapper;

    /**
     * 大章列表查询
     * @param pageDto
     */
    public void list(PageDto pageDto) {
        PageHelper.startPage(pageDto.getPage(),pageDto.getSize());
        ${Domain}Example example = new ${Domain}Example();
        List<${Domain}> ${domain}s = ${domain}Mapper.selectByExample(example);
        PageInfo<${Domain}> pageInfo = new PageInfo<>(${domain}s);
        pageDto.setTotal(pageInfo.getTotal());

        List<${Domain}Dto> ${domain}DtoList = CopyUtil.copyList(${domain}s, ${Domain}Dto.class);
        pageDto.setList(${domain}DtoList);
    }

    /**
     * 保存大章信息
     * @param ${domain}Dto
     */
    public void save(${Domain}Dto ${domain}Dto) {
        ${Domain} ${domain} = CopyUtil.copy(${domain}Dto, ${Domain}.class);
        if (StringUtils.isEmpty(${domain}Dto.getId())) {
            insert(${domain});
        } else {
            update(${domain});
        }
    }

    private void insert(${Domain} ${domain}) {
        ${domain}.setId(UuidUtil.getShortUuid());
        ${domain}Mapper.insert(${domain});
    }

    private void update(${Domain} ${domain}) {
        ${domain}Mapper.updateByPrimaryKey(${domain});
    }

    /**
     * 根据id删除大章信息
     * @param id
     */
    public void delete(String id) {
        ${domain}Mapper.deleteByPrimaryKey(id);
    }
}
