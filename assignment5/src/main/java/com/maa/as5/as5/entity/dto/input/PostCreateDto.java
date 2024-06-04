package com.maa.as5.as5.entity.dto.input;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
public class PostCreateDto {
    private String title;
    private String content;
    private int authorId;
}
