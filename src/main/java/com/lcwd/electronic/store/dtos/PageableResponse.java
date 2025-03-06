package com.lcwd.electronic.store.dtos;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

//public class PageableResponse<UserDto> {
public class PageableResponse<T> {
    // if we use userdto we only will be able to use it for userdto type only not than that so we are creating generic type
//    private List<UserDto> content;
    private List<T> content;
    private int pageNumber;
    private int pageSize;
    private long TotalElements;
    private int totalPages;
    private boolean lastPage;
}
