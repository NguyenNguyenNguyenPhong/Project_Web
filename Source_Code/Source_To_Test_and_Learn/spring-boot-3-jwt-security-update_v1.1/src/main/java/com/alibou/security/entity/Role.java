package com.alibou.security.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "roleID")
    private int roleID;

    @Column(name = "create")
    private boolean create;

    @Column(name = "update")
    private boolean update;

    @Column(name = "read")
    private boolean read;

    @Column(name = "delete")
    private boolean delete;

    public Role() {
    }

    public Role(boolean create, boolean update, boolean read, boolean delete) {
        this.create = create;
        this.update = update;
        this.read = read;
        this.delete = delete;
    }

    public int getRoleID() {
        return roleID;
    }

    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }

    public boolean isCreate() {
        return create;
    }

    public void setCreate(boolean create) {
        this.create = create;
    }

    public boolean isUpdate() {
        return update;
    }

    public void setUpdate(boolean update) {
        this.update = update;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public boolean isDelete() {
        return delete;
    }

    public void setDelete(boolean delete) {
        this.delete = delete;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleID=" + roleID +
                ", create=" + create +
                ", update=" + update +
                ", read=" + read +
                ", delete=" + delete +
                '}';
    }
}
