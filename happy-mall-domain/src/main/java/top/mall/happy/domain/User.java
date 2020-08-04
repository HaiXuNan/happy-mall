package top.mall.happy.domain;

import com.baomidou.mybatisplus.annotation.*;

import java.time.Instant;

/**
 * @author xhn
 * @date 2020/7/21
 */
@TableName("user")
public class User {

    @TableId(type = IdType.AUTO)
    private Long id;

    private String username;

    private String password;

    @TableField(fill = FieldFill.INSERT)
    private Instant createAt;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Instant updateAt;

    private Integer type;

    private Integer activeStatus;

    public Long getId() {
        return id;
    }

    public User setId(Long id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public Instant getCreateAt() {
        return createAt;
    }

    public User setCreateAt(Instant createAt) {
        this.createAt = createAt;
        return this;
    }

    public Instant getUpdateAt() {
        return updateAt;
    }

    public User setUpdateAt(Instant updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public User setType(Integer type) {
        this.type = type;
        return this;
    }

    public Integer getActiveStatus() {
        return activeStatus;
    }

    public User setActiveStatus(Integer activeStatus) {
        this.activeStatus = activeStatus;
        return this;
    }
}
