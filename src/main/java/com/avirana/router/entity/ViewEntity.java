package com.avirana.router.entity;

import jakarta.persistence.*;
import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
@Table(name = "views")
public class ViewEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;

    @Column(name = "url", nullable = false)
    private String url;

    @Column(name = "ip", nullable = false)
    private String ip;


    @Column(name = "viewed_at",  insertable = false, updatable = false)
    private OffsetDateTime viewedAt;

    public ViewEntity() {
    }

    public ViewEntity(String url, String ip) {
        this.url = url;
        this.ip = ip;
    }

    // Getters and Setters

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public OffsetDateTime getViewedAt() {
        return viewedAt;
    }

    public void setViewedAt(OffsetDateTime viewedAt) {
        this.viewedAt = viewedAt;
    }
}