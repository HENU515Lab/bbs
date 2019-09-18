package com.seriouszyx.bbs.base.domain;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Blog extends BaseDomain {

    private String title;
    private String keywords;
    private String content;
//    private Long authorId;
    private int commentSize;
    private Date createTime;
    private int readSize;
    private int voteSize;

    private User author;

    private List<BlogComment> comments;


}
