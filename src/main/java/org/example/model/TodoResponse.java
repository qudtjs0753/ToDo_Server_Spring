package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class TodoResponse {
    private Long id;
    private String title;
    private Long order;
    private Boolean completed;
    private String url;

    public TodoResponse(TodoEntity todoEntity) {
        this.id = todoEntity.getId();
        this.title = todoEntity.getTitle();
        this.order = todoEntity.getOrder();
        this.completed = todoEntity.getCompleted();

        //여기서 url은 todoEntity에는 없는것이라 작성함.
        //여기에 하드코딩된 문자열이 들어와있는것은 결코 좋지 않다.
        //base url주소 바뀌거나, 포트번호 바뀌는 경우들이 있기때문.
        //보통은 config나 property로 이것들을 관리
        //여기서는 그렇게까진 하지 않겠다.
        this.url = "http://localhost:8080/" + this.id;
    }
}
