package com.anaplan.client.dto;

import java.io.Serializable;
import java.util.Objects;

public class CategoryValueData implements Serializable {
    private String id;
    private String attribute;
    private String categoryId;
    private String categoryName;

    public CategoryValueData() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryValueData that = (CategoryValueData) o;
        return Objects.equals(id, that.id) && Objects.equals(attribute, that.attribute) && Objects.equals(categoryId, that.categoryId) && Objects.equals(categoryName, that.categoryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, attribute, categoryId, categoryName);
    }
}
