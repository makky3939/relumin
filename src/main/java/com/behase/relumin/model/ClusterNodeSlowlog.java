package com.behase.relumin.model;

import lombok.Data;

import java.util.List;

@Data
public class ClusterNodeSlowlog {
    private String queryId;
    private String createdAt;
    private String executionTime;
    private List<String> paramaters;

}
