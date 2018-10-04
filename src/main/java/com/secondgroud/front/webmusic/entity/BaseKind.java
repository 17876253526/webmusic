package com.secondgroud.front.webmusic.entity;

public class BaseKind {
    private Integer baseKindId;

    private String name;

    private String category;

    public Integer getBaseKindId() {
        return baseKindId;
    }

    public void setBaseKindId(Integer baseKindId) {
        this.baseKindId = baseKindId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }
}