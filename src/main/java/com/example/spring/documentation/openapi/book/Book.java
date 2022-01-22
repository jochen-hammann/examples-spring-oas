package com.example.spring.documentation.openapi.book;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Schema(description = "A book.")
public class Book
{
    // ============================== [Fields] ==============================

    // -------------------- [Private Fields] --------------------

    // @formatter:off
    @Schema(description = "The book's ID. And"
            + "an example of a multiline description.", format = "uuid")
    // @formatter:on
    private long id;

    // @formatter:off
    @NotBlank
    @Size(min = 0, max = 20)
    @Schema(description = "The book's title.")
    // @formatter:on
    private String title;

    // @formatter:off
    @NotBlank
    @Size(min = 0, max = 30)
    @Schema(description = "The book's author.")
    // @formatter:on
    private String author;

    // ============================== [Construction / Destruction] ==============================

    // -------------------- [Private Construction / Destruction] --------------------

    // -------------------- [Public Construction / Destruction] --------------------

    // ============================== [Getter/Setter] ==============================

    // -------------------- [Private Getter/Setter] --------------------

    // -------------------- [Public Getter/Setter] --------------------

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    // ============================== [Methods] ==============================

    // -------------------- [Private Methods] --------------------

    // -------------------- [Public Methods] --------------------

}
