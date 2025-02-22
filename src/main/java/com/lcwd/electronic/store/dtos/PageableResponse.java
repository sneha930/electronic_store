package com.lcwd.electronic.store.dtos;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class PageableResponse<T> {
    private List<T> content;
    private int pageNumber;
    private int pageSize;
    private long TotalElements;
    private int totalPages;
    private boolean lastPage;
}
