package com.example.springmongodb.book;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.io.Serial;
import java.io.Serializable;

@Data
@Document(collection = "books")
public class Book implements Serializable {
    @Serial
    private static final long serialVersionUID = -8185564481260496594L;

    @MongoId(FieldType.OBJECT_ID)
    private String id;
    private String title;
    private String author;
    private String description;
}
