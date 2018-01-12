package cn.javay.minion.demo.provider.entity;

import javax.persistence.*;

/**
 * Created by shuzheng on 2018/1/12.
 */
@Entity
@Table(name = "demo_user", schema = "minion", catalog = "")
public class DemoUser {
    private int userId;
    private String username;
    private String password;

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DemoUser demoUser = (DemoUser) o;

        if (userId != demoUser.userId) return false;
        if (username != null ? !username.equals(demoUser.username) : demoUser.username != null) return false;
        if (password != null ? !password.equals(demoUser.password) : demoUser.password != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }
}
