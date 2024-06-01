package com.maa.as3.as3.entity.dto.input;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
public class CommentCreateDto {
    private String content;
    private int postId;
}
