package com.xinhnguyen.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class Permission implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @ManyToMany(mappedBy = "permissions")
    private Set<User> users;

    public Permission() {
    }

    public Permission(Long id, String name, Set<User> users) {
        this.id = id;
        this.name = name;
        this.users = users;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}