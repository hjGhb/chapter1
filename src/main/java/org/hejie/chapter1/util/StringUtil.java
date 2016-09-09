package org.hejie.chapter1.util;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by admin on 2016/9/9.
 */
public final class StringUtil {

    /**
     * 判断字符串是否为空
     * @param str
     * @return
     */
    public static boolean isEmpty(String str){
        if(str != null){
            str = str.trim();
        }

        return StringUtils.isEmpty(str);
    }

    /**
     * 判断字符串是否非空
     * @param str
     * @return
     */
    public static boolean isNotEmpty(String str){
        return !isEmpty(str);
    }


}
