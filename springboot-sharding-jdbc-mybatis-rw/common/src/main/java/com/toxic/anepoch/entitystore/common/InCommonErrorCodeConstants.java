

package com.toxic.anepoch.entitystore.common;


import com.toxic.ypan.common.exception.ErrorCode;
import com.toxic.ypan.common.exception.SystemSegment;

/**
 * ErrorCode 常量类
 * <p>
 * 共通：1010001开始 新建/更新预订：1011001开始 支付：1012001开始 取消预订：1013001开始 party：1014001开始 share：1015001开始 修改预订：1016001开始
 * 确认信：1017001开始 fixed charge：18001开始 item：1019001开始 package：1020001开始 config：1021001开始 alert：1022001开始 Gc 1023001开始
 *
 * @author tianyu.yang created on 2018/12/20
 */
public class InCommonErrorCodeConstants {

    private InCommonErrorCodeConstants() {
    }

    private static ErrorCode errorTemplate(int code, String message) {
        return SystemSegment.INCOMMON.buildErrorCode(code, message);
    }

    /**
     * 参数非空
     */
    public static final ErrorCode PARAM_IS_EMPTY = errorTemplate(1, "%s can't be empty.");
    /**
     * 多参数为空
     */
    public static final ErrorCode PARAM_IS_ALL_EMPTY = errorTemplate(2, "%s can't be empty at the same time.");

}
