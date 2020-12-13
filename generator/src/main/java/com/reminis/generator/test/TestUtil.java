package com.reminis.generator.test;


import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestUtil {

    private static String ftlPath = "G:\\github\\cnblogs\\course\\generator\\src\\main\\java\\com\\reminis\\generator\\test";

    private static String toPath = "G:\\github\\cnblogs\\course\\generator\\src\\main\\java\\com\\reminis\\generator\\test\\";

    public static void main(String[] args) throws IOException, TemplateException {
        Configuration configuration  = new Configuration(Configuration.VERSION_2_3_30);
        configuration.setDirectoryForTemplateLoading(new File(ftlPath));
        configuration.setObjectWrapper(new DefaultObjectWrapper(Configuration.VERSION_2_3_30));
        Template template = configuration.getTemplate("test.ftl");

        FileWriter fileWriter = new FileWriter(toPath + "Test.java");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        template.process(null,bufferedWriter);
        bufferedWriter.flush();
        fileWriter.close();
    }
}
