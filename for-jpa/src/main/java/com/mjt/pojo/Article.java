package com.mjt.pojo;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

/**
 * @Description
 * @Author mjt
 * @Time 2022/7/15
 */
@Data
@Entity
public class Article extends BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true)
    @NotEmpty(message = "书名不能为空")
    private String title;

    @Column(nullable = false)
    private String body;

}
