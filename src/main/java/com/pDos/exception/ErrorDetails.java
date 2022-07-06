package com.pDos.exception;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Map;

/**
 * ErrorDetails model class
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorDetails {

    private int code;

    private String message;

    private Map<String, Object> details;

    /**
     * Creates a new instance of {@link ErrorDetails}
     */
    public ErrorDetails() {
    }

    /**
     * Creates a new instance of {@link ErrorDetails}
     *
     * @param code    the code of the error
     * @param message the general description
     * @param details the error details
     */
    public ErrorDetails(final int code, final String message, final Map<String, Object> details) {
        this.code = code;
        this.message = message;
        this.details = details;
    }

    public int getCode() {
        return code;
    }

    public void setCode(final int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public Map<String, Object> getDetails() {
        return details;
    }

    public void setDetails(final Map<String, Object> details) {
        this.details = details;
    }
}
