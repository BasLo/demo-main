package com.demo.main.dto;

import lombok.Getter;
import org.jetbrains.annotations.NotNull;
import org.springframework.http.ResponseEntity;

@Getter
public class Response<T> {

    private final T body;
    private final String errorMessage;
    private final int code;

    private Response(T body, String errorMessage, int code) {
        this.body = body;
        this.errorMessage = errorMessage;
        this.code = code;
    }

    @NotNull
    public static <T> ResponseEntity<Response<T>> ok(T body) {
        Response<T> response = new Response<>(body, null, 0);
        return ResponseEntity.ok(response);
    }

    @NotNull
    public static ResponseEntity<Response<Void>> error(String errorMessage, int code) {
        Response<Void> response = new Response<>(null, errorMessage, code);
        return ResponseEntity.ok(response);
    }

}
