package com.moqi.book.chapter09;

import com.moqi.tool.Tool;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static com.moqi.data.Data.TEXT_32_TXT;

/**
 * @author moqi
 * On 2/27/20 10:18
 */
@Slf4j
public class H06 {

    private static final String REGEX = "(?<=<[tT][iI][tT][lL][eE]>).*(?=</[tT][iI][tT][lL][eE]>)";

    /**
     * 2020-03-07 21:35:01 INFO  H06:24 - list:[Ben Forta’s Homepage]
     */
    public static void main(String[] args) {
        List<String> list = Tool.patternString(REGEX, TEXT_32_TXT);
        log.info("list:{}", list);
    }

}
