package com.reminis.generator.server;

import com.reminis.generator.util.FreemarkerUtil;
import freemarker.template.TemplateException;

import java.io.IOException;

public class ServerGenerator {

    private static String toPath = "G:\\github\\cnblogs\\course\\generator\\src\\main\\java\\com\\reminis\\generator\\test\\";

    public static void main(String[] args) throws IOException, TemplateException {
        FreemarkerUtil.initConfig("test.ftl");
        FreemarkerUtil.generator(toPath + "Test.java");
    }
}
