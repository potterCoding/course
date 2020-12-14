package com.reminis.business.controller.admin;

import com.reminis.server.domain.${Domain};
import com.reminis.server.dto.${Domain}Dto;
import com.reminis.server.dto.PageDto;
import com.reminis.server.dto.ResponseDto;
import com.reminis.server.service.${Domain}Service;
import com.reminis.server.util.ValidatorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/admin/${domain}")
public class ${Domain}Controller {
    private static final Logger LOG = LoggerFactory.getLogger(${Domain}Controller.class);
    private static final String BUSINESS_NAME = "大章";

    @Resource
    private ${Domain}Service ${domain}Service;

    /**
     * 大章列表查询
     * @param pageDto
     * @return
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        ResponseDto responseDto = new ResponseDto();
        ${domain}Service.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     * 保存大章信息
     * @param ${domain}Dto
     * @return
     */
    @PostMapping("/save")
    public ResponseDto save(@RequestBody ${Domain}Dto ${domain}Dto) {
        //保存校验

        ResponseDto responseDto = new ResponseDto();
        ${domain}Service.save(${domain}Dto);
        responseDto.setContent(${domain}Dto);
        return responseDto;
    }

    /**
     * 删除大章信息
     * @param id
     * @return
     */
    @DeleteMapping("/delete/{id}")
    public ResponseDto delete(@PathVariable String id) {
        ResponseDto responseDto = new ResponseDto();
        ${domain}Service.delete(id);
        responseDto.setContent(id);
        return responseDto;
    }

}
