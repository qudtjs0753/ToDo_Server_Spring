package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//entity아니니까 entity는 안붙임.
@Data
@NoArgsConstructor
@AllArgsConstructor

public class TodoRequest {

    private  String title;
    private  Long order;
    private Boolean completed;
}
