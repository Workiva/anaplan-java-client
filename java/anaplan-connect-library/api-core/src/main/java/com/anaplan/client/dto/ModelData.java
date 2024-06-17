package com.anaplan.client.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by Spondon Saha User: spondonsaha Date: 6/21/17 Time: 3:28 PM
 */
public class ModelData implements Serializable {
    private String id;
    private String name;
    private String activeState;
    private String currentWorkspaceId;
    private String currentWorkspaceName;
    private String isoCreationDate;
    private String lastModified;
    private String lastModifiedByUserGuid;
    private String lastSavedSerialNumber;
    private long memoryUsage;
    private String modelUrl;
    private boolean modelTransactionRunning;
    private CategoryValueData[] categoryValues;

    /**
     * Default constructor.
     */
    public ModelData() {
    }

    /**
     * All-args constructor.
     *
     * @param id   The model id.
     * @param name The model name.
     */
    public ModelData(String id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Constructor with model - id.
     *
     * @param id The model id.
     */
    public ModelData(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrentWorkspaceId() {
        return currentWorkspaceId;
    }

    public void setCurrentWorkspace(String currentWorkspaceId) {
        this.currentWorkspaceId = currentWorkspaceId;
    }

    public long getMemoryUsage() {
        return memoryUsage;
    }

    public void setMemoryUsage(long memoryUsage) { this.memoryUsage = memoryUsage; }

    public String getActiveState() { return activeState; }

    public void setActiveState(String activeState) { this.activeState = activeState; }

    public void setCurrentWorkspaceId(String currentWorkspaceId) { this.currentWorkspaceId = currentWorkspaceId; }

    public String getCurrentWorkspaceName() { return currentWorkspaceName; }

    public void setCurrentWorkspaceName(String currentWorkspaceName) { this.currentWorkspaceName = currentWorkspaceName; }

    public String getModelUrl() { return modelUrl; }

    public void setModelUrl(String modelUrl) { this.modelUrl = modelUrl; }

    public CategoryValueData[] getCategoryValues() { return categoryValues; }

    public void setCategoryValues(CategoryValueData[] categoryValues) { this.categoryValues = categoryValues; }

    public String getIsoCreationDate() { return isoCreationDate; }

    public void setIsoCreationDate(String isCreationDate) { this.isoCreationDate = isCreationDate; }

    public String getLastModified() { return lastModified; }

    public void setLastModified(String lastModified) { this.lastModified = lastModified;}

    public String getLastModifiedByUserGuid() { return lastModifiedByUserGuid; }

    public void setLastModifiedByUserGuid(String lastModifiedByUserGuid) { this.lastModifiedByUserGuid = lastModifiedByUserGuid; }

    public String getLastSavedSerialNumber() { return lastSavedSerialNumber; }

    public void setLastSavedSerialNumber(String lastSavedSerialNumber) { this.lastSavedSerialNumber = lastSavedSerialNumber; }

    public boolean isModelTransactionRunning() { return modelTransactionRunning; }

    public void setModelTransactionRunning(boolean modelTransactionRunning) { this.modelTransactionRunning = modelTransactionRunning; }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModelData)) {
            return false;
        }
        ModelData modelData = (ModelData) o;
        return Objects.equals(id, modelData.id);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
