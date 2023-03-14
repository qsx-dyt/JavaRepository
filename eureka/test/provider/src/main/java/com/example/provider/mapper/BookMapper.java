package com.example.provider.mapper;

import com.example.common.dto.BookDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BookMapper {
    List<BookDto> findAll();
}
