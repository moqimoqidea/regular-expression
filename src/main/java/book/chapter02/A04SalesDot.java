package book.chapter02;

import lombok.extern.slf4j.Slf4j;
import tool.Tool;

import java.util.List;

import static book.chapter02.A00Data.FILE_NAME_LIST_2;

/**
 * @author moqi
 * On 2/27/20 10:01
 */
@Slf4j
public class A04SalesDot {

    public static void main(String[] args) {
        List<String> list = Tool.patternList("sales.", FILE_NAME_LIST_2);
        // 2020-02-27 10:07:20 INFO  A04SalesDot:20 - list:[sales1, sales2, sales3, sales.]
        log.info("list:{}", list);
    }

}