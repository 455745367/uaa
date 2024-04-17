package com.stockcloud.robot.service.utils;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

/**
 * @author fuchengyong
 * @version 1.0
 * @description: TODO
 * @date 9/8/22 14:37
 */
public class Utils {

    public static <T> List<List<T>> split(List<T> list, int batchSize) {
        //参数校验
        if (list == null || list.isEmpty()) {
            throw new RuntimeException("list集合不可以为空");
        }
        if (batchSize <= 0) {
            throw new RuntimeException("batchSize不可以<=0");
        }
        List<List<T>> resultList = new ArrayList<>();
        int i1 = list.size() / batchSize;
        int i2 = i1 * batchSize + list.size() % batchSize;
        if (i1 > 0) {
            for (int i = 0; i < i1; i++) {
                resultList.add(list.subList(i * batchSize, (i + 1) * batchSize));
            }
        }
        if (list.size() % batchSize > 0) {
            resultList.add(list.subList(i1 * batchSize, i2));
        }
        return resultList;
    }

    /**
     * 数字转换
     * @param str
     * @return
     */
    public static String convert(String str) {
        String[] data = new String[] { "〇", "①", "②", "③", "④", "⑤", "⑥", "⑦", "⑧", "⑨", "⑩" };
        if (StringUtils.isEmpty(str)) return " ";
        int numeral = Integer.parseInt(str);
        StringBuilder result = new StringBuilder();
        while (numeral != 0) {
            int number = numeral % 10;
            result.insert(0, data[number]);
            numeral /= 10;
        }
        return result.toString();
    }
}
