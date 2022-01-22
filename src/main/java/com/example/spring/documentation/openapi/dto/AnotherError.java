package com.example.spring.documentation.openapi.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(title = "Another Error", description = "An other error.")
public class AnotherError
{
    // ============================== [Fields] ==============================

    // -------------------- [Private Fields] --------------------

    @Schema(description = "The other error's ID.")
    private String id;

    @Schema(description = "The other error's message.")
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
