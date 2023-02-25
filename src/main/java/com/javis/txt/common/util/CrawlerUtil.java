package com.javis.txt.common.util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.Iterator;

public class CrawlerUtil {

    public void getGoogleSearchList(String url){

        Document document = null;

        try{
            document = Jsoup.connect(url).get();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        Elements element = document.select("a");
        Iterator<Element> anchorIter = element.iterator();

        while(anchorIter.hasNext()){
            Element temp = anchorIter.next();
            System.out.println(temp.text());
            System.out.println(temp.attr("href"));
        }



    }


}
