package com.crio.starter.data;

import lombok.*;
import com.mongodb.lang.NonNull;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "memes")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MemeEntity {
    @Id
    String id;
    String name;
    String caption;
    String url;

    @CreatedDate
    LocalDateTime createdAt;


}