package com.sublease.common.vo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Page;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jzhou237 on 2017-07-27.
 */
@Setter
@Getter
public class PagingData<T> {

    private int index;

    private long totalNumber;

    private int size;

    private int totalPages;

    private List<T> data = new ArrayList<>();

    public static PagingData getPagingData(Page page) {
        PagingData pagingData = new PagingData();
        pagingData.setIndex(page.getNumber());
        pagingData.setSize(page.getSize());
        pagingData.setTotalNumber(page.getTotalElements());
        pagingData.setTotalPages(page.getTotalPages());
        pagingData.setData(page.getContent());
        return pagingData;
    }
}
