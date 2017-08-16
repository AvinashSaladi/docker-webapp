package com.visualpathit.account.model;


import javax.persistence.*;
import java.util.Set;
/**{@author waheedk}*/
@Entity
@Table(name = "user")
public class User {
    private Long id;
    private String username;
    private String password;
    private String userEmail;
    private String passwordConfirm;
    private Set<Role> roles;
    /**
     * {@inheritDoc}} 
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    /**
     * {@link User#id}
     */
    public Long getId() {
        return id;
    }
    /**
     * {@inheritDoc}} 
     */
    public final void setId(final Long id) {
        this.id = id;
    }
    /**
     * {@inheritDoc}} 
     */
    public String getUsername() {
        return username;
    }
    /**
     * {@inheritDoc}} 
     */
    public final void setUsername(final String username) {
        this.username = username;
    }
    /**
     * {@link User#password}
     */
    public String getPassword() {
        return password;
    }
    /**
     * {@inheritDoc}} 
     */
    public final void setPassword(final String password) {
        this.password = password;
    }
    /**
     * {@link User#userEmail}
     */
    public String getUserEmail() {
		return userEmail;
	}
    /**
     * {@inheritDoc}} 
     */
	public final void setUserEmail(final String userEmail) {
		this.userEmail = userEmail;
	}

	 /**
     * {@inheritDoc}} 
     */
	@Transient
	/**
     * {@link User#passwordConfirm}
     */
    public String getPasswordConfirm() {
        return passwordConfirm;
    }
	 /**
     * {@inheritDoc}} 
     */
    public final void setPasswordConfirm(final String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }
    /**
     * {@inheritDoc}} 
     */
    @ManyToMany
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    public Set<Role> getRoles() {
        return roles;
    }
    /**
     * {@inheritDoc}} 
     */
    public final void setRoles( final Set<Role> roles) {
        this.roles = roles;
    }
}
