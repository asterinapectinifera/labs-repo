package org.example;

public class User {
    private String name;
    private Role role;

    public User(String name, Role role) {
        setName(name);
        setRole(role);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "имя" + name + " роль " + role;
    }
}
