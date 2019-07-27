package com.zlf.demo01;

import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class XPathDemo {
    public static void main(String[] args) throws IOException, XpathSyntaxErrorException {
        //获取XML路径
        String path = Demo.class.getClassLoader().getResource("users.xml").getPath();
        //创建Document对象
        Document d = Jsoup.parse(new File(path), "utf-8");

        //XPath
        JXDocument jxDocument = new JXDocument(d);
        List<JXNode> jxNodes = jxDocument.selN("//user");
        System.out.println(jxNodes);
    }
}