package com.example.springpractice.entity;

/**
 * @author：Cheng.
 * @date：Created in 21:42 2019/10/14
 */
public final class ResponseBuilder {

    private String code;
    private String desc;

    private boolean withTimestamp = false;

    private ResponseBuilder() {}

    /**
     * Create response bean builder.
     *
     * @return the response bean builder
     */
    private static ResponseBuilder empty() {
        return new ResponseBuilder();
    }

    /**
     * Succeed response bean.
     *
     * @param <T> the type parameter
     * @param code the code
     * @param desc the desc
     * @param content the content
     * @return the response bean
     */
    public static <T> ResponseBean<T> succeed(String code, String desc, T content) {
        return empty().withCode(code).withDesc(desc).build(content);
    }

    /**
     * Succeed response bean builder.
     *
     * @param <T> the type parameter
     * @param desc the desc
     * @param content the content
     * @return the response bean builder
     */
    public static <T> ResponseBean<T> succeed(String desc, T content) {
        return succeed("00000", desc, content);
    }

    /**
     * Succeed response bean.
     *
     * @param <T> the type parameter
     * @param code the code
     * @param desc the desc
     * @return the response bean
     */
    public static <T> ResponseBean<T> succeed(String code, String desc) {
        return succeed(code, desc, null);
    }

    /**
     * Failed response bean builder.
     *
     * @param <T> the type parameter
     * @param code the code
     * @param desc the desc
     * @param content the content
     * @return the response bean builder
     */
    public static <T> ResponseBean<T> failed(String code, String desc, T content) {
        return empty().withCode(code).withDesc(desc).build(content);
    }

    /**
     * With code response bean builder.
     *
     * @param code the code
     * @return the response bean builder
     */
    private ResponseBuilder withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * With desc response bean builder.
     *
     * @param desc the desc
     * @return the response bean builder
     */
    private ResponseBuilder withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * With timestamp response builder.
     *
     * @return the response builder
     */
    public ResponseBuilder withTimestamp() {
        this.withTimestamp = true;
        return this;
    }

    /**
     * Build response bean.
     *
     * @param <T> the type parameter
     * @param content the content
     * @return the response bean
     */
    private <T> ResponseBean<T> build(T content) {
        ResponseBean<T> responseBean = new ResponseBean<>(code, desc);
        responseBean.setContent(content);
        if (withTimestamp) {
            responseBean.setTimestamp(System.currentTimeMillis());
        }
        return responseBean;
    }
}
