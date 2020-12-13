package com.reminis.business.controller.admin;

import com.reminis.server.domain.Chapter;
import com.reminis.server.dto.ChapterDto;
import com.reminis.server.dto.PageDto;
import com.reminis.server.service.ChapterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/admin/chapter")
public class ChapterController {
    private static final Logger LOG = LoggerFactory.getLogger(ChapterController.class);
    
    @Resource
    private ChapterService chapterService;

    @PostMapping("/list")
    public PageDto list(@RequestBody PageDto pageDto) {
        LOG.info(("pagerDto: {}" + pageDto));
        chapterService.list(pageDto);
        return pageDto;
    }

    @PostMapping("/save")
    public void save(@RequestBody ChapterDto chapterDto) {
        LOG.info("chapterDto: {}" + chapterDto);
        chapterService.save(chapterDto);
    }

}
