package com.trello.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Boards {

    @JsonProperty("board_name")
    private String boardName;

    @JsonProperty("columns")
    private List<Columns> boardColumn;
}
