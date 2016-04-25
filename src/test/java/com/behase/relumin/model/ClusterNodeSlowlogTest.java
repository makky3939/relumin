package com.behase.relumin.model;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.Sets;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ClusterNodeSlowlogTest {
    private ClusterNodeSlowlog clusterNodeSlowlog;

    @Before
    public void before() {
        clusterNodeSlowlog = new ClusterNodeSlowlog();
    }

    @Test
    public void getCommandSet() {

    }

}
