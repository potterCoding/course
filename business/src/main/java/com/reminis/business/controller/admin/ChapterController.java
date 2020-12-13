package com.reminis.business.controller.admin;

import com.reminis.server.dto.ChapterDto;
import com.reminis.server.service.ChapterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class ChapterController {

    @Resource
    private ChapterService chapterService;

    @GetMapping("/chapter")
    public List<ChapterDto> chapter() {
        return chapterService.list();
    }

}
