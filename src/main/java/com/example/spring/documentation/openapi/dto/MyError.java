package com.example.spring.documentation.openapi.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(title = "My Error", description = "An error.")
public class MyError
{
    // ============================== [Fields] ==============================

    // -------------------- [Private Fields] --------------------

    @Schema(description = "The error's ID.")
    private String id;

    @Schema(description = "The error's message.")
    private String message;

    // ============================== [Construction / Destruction] ==============================

    // -------------------- [Public Construction / Destruction] --------------------

    // ============================== [Getter/Setter] ==============================

    // -------------------- [Private Getter/Setter] --------------------

    // -------------------- [Public Getter/Setter] --------------------

    // ============================== [Methods] ==============================

    // -------------------- [Private Methods] --------------------

    // -------------------- [Public Methods] --------------------

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }
}
