package com.models.Article;

import com.models.User.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ArticleDTO {
    private Long article_id;
    private User user_id;
    private String name;
    private String text;
    private Date created_at;
    private String contacts;
    private String image;
}
