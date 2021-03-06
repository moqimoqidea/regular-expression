package com.moqi.book.chapter04;

import com.moqi.tool.Tool;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static com.moqi.data.Data.TEXT_09_TXT;

/**
 * @author moqi
 * On 2/27/20 10:37
 */
@Slf4j
public class C03 {

    /**
     * 2020-02-27 13:33:58 INFO  C03:22 - list:[\, \, \, \]
     */
    public static void main(String[] args) {
        List<String> list = Tool.patternString("\\\\", TEXT_09_TXT);
        log.info("list:{}", list);
    }

}
