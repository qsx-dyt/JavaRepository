package com.example.provider.mapper;

import com.example.common.dto.BookDto;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;

@SpringBootTest
class BookMapperTest {
    @Resource
    BookMapper bm;
    @Test
    void findAll() {
        List<BookDto> books=bm.findAll();
        System.out.println(books);
    }
}