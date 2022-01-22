package com.example.spring.documentation.openapi.book;

import com.example.spring.documentation.openapi.dto.AnotherError;
import com.example.spring.documentation.openapi.dto.MyError;
import com.example.spring.documentation.openapi.exceptions.BookNotFoundException;
import com.example.spring.documentation.openapi.exceptions.MyException;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Collection;

@RestController
@RequestMapping("/api/book")
public class BookController
{
    // ============================== [Fields] ==============================

    // -------------------- [Private Fields] --------------------

    @Autowired
    private BookRepository repository;

    // ============================== [Construction / Destruction] ==============================

    // -------------------- [Public Construction / Destruction] --------------------

    // ============================== [Getter/Setter] ==============================

    // -------------------- [Private Getter/Setter] --------------------

    // -------------------- [Public Getter/Setter] --------------------

    // ============================== [Methods] ==============================

    // -------------------- [Private Methods] --------------------

    // -------------------- [Public Methods] --------------------

    // @formatter:off
    @ApiResponse(
            responseCode = "500",
            description = "An error occurred.",
            content = @Content(
                    mediaType = MediaType.APPLICATION_JSON_VALUE,
                    schema = @Schema(implementation = MyError.class)
            )
    )
    // @formatter:on
    @ExceptionHandler(MyException.class)  // Caution: All endpoints of the current controller specify this error.
    //@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)  // Not required, if other OpenAPI documentation is specified (e.g. @ApiResponse).
    public ResponseEntity<String> handleMyError(MyException ex)
    {
        ResponseEntity<String> responseEntity = new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        return responseEntity;
    }

    // @formatter:off
    @Operation(summary = "Get a book by its id",
               description = "Lorem ipsum dolor sit amet, **consetetur sadipscing** elitr, "
                       + "sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, "
                       + "sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita"
                       + "kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum "
                       + "dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut."
                       + "\n\n"
                       + "The following tests show the specification of tables and lists."
                       + "\n\n"
                       + "Header 1 | Header 2\n"
                       + "--- | ---\n"
                       + "Cell 1 | Cell 2\n"
                       + "\n\n"
                       + "* List 1\n"
                       + "* List 2",
               tags = "Book Controller")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                         description = "Found the book",
                         content = { @Content(mediaType = "application/json",
                                              schema = @Schema(implementation = Book.class)) }),
            @ApiResponse(responseCode = "400",
                         description = "Invalid id supplied",
                         content = @Content),
            @ApiResponse(responseCode = "404",
                         description = "Book not found",
                         content = @Content(mediaType = "application/json",
                                            schema = @Schema(oneOf = {MyError.class, AnotherError.class}))) })
    // @formatter:on
    @GetMapping("/{id}")
    public Book findById(@Parameter(description = "id of book to be searched") @PathVariable long id)
    {
        return repository.findById(id).orElseThrow(() -> new BookNotFoundException());
    }

    @GetMapping("/")
    public Collection<Book> findBooks()
    {
        return repository.getBooks();
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Book updateBook(@PathVariable("id") final String id, @RequestBody final Book book)
    {
        return book;
    }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Book patchBook(@PathVariable("id") final String id, @RequestBody final Book book)
    {
        return book;
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public Book postBook(@NotNull @Valid @RequestBody final Book book)
    {
        return book;
    }

    @RequestMapping(method = RequestMethod.HEAD,
                    value = "/")
    @ResponseStatus(HttpStatus.OK)
    public Book headBook()
    {
        return new Book();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public long deleteBook(@PathVariable final long id)
    {
        return id;
    }
}
