package com.imooc.seller.sign;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.imooc.util.JsonUtil;

/**
 * η­Ύεζζ
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(alphabetic = true)
public interface SignText {
    default String toText(){
        return JsonUtil.toJson(this);
    }
}
