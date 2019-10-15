package com.example.springpractice.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author：Cheng.
 * @date：Created in 21:41 2019/10/14
 */
@Data
@ToString
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"code", "desc", "content", "timestamp"})
public class ResponseBean<T> {


    @JsonProperty("code")
    private String code;


    @JsonProperty("message")
    private String desc;


    @JsonProperty("timestamp")
    private Long timestamp;


    @JsonProperty("body")
    private T content;

    private ResponseBean() {}

    /**
     * Instantiates a new Response bean.
     *
     * @param code the code
     * @param desc the desc
     */
    ResponseBean(String code, String desc) {
        this();

        this.code = code;
        this.desc = desc;
    }
}

