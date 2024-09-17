package com.symon.portal.Utils.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiResponse<T> {
    private boolean success;
    private T data;
    private ApiError error;
    private String message;

    public ApiResponse(boolean success, T data, String message) {
        this.success = success;
        this.data = data;
        this.error = null;
        this.message = message;
    }

    public ApiResponse(boolean success, ApiError error) {
        this.success = success;
        this.data = null;
        this.error = error;
    }
}
