package com.review.analyzer.service;

import java.util.List;

public interface FileCsvParser<T> {
    List<T> parse(String path);
}
