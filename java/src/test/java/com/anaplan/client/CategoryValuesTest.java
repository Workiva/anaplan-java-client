package com.anaplan.client;

import com.anaplan.client.dto.ModelData;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.Test;

public class CategoryValuesTest {
    private static final String OBJECT_CATEGORY_VALUES = "{ \"id\": \"id1\", \"name\": \"TestModel1\", \"activeState\": \"MAINTENANCE\", \"lastSavedSerialNumber\": 50302010, \"lastModifiedByUserGuid\": \"guid1\", \"memoryUsage\": 12345, \"currentWorkspaceId\": \"guid2\", \"currentWorkspaceName\": \"Workspace\", \"modelUrl\": \"https://my.anaplan.com/anaplan/framework.jsp?selectedWorkspaceId=guid2&selectedModelId=id1\", \"categoryValues\": [ { \"id\": \"id2\", \"attribute\": \"Office Supplies\", \"categoryId\": \"id3\", \"categoryName\": \"Etcetera\", \"customerId\": \"id4\" } ], \"isoCreationDate\": \"2020-01-01T00:00:00.000+0000\", \"lastModified\": \"2020-01-01T00:00:00.000+0000\" }";
    private static final String STRING_CATEGORY_VALUES = "{ \"id\": \"id1\", \"name\": \"TestModel1\", \"activeState\": \"MAINTENANCE\", \"lastSavedSerialNumber\": 50302010, \"lastModifiedByUserGuid\": \"guid1\", \"memoryUsage\": 12345, \"currentWorkspaceId\": \"guid2\", \"currentWorkspaceName\": \"Workspace\", \"modelUrl\": \"https://my.anaplan.com/anaplan/framework.jsp?selectedWorkspaceId=guid2&selectedModelId=id1\", \"categoryValues\": [ \"Testing\" ], \"isoCreationDate\": \"2020-01-01T00:00:00.000+0000\", \"lastModified\": \"2020-01-01T00:00:00.000+0000\" }";

    @Test()
    public void modelDataAllowsRandomObjectsForCategoryValues() throws Exception {
        final ObjectMapper mapper = new ObjectMapper();
        mapper.readValue(OBJECT_CATEGORY_VALUES, ModelData.class);
    }

    @Test()
    public void modelDataAllowsStringsForCategoryValues() throws Exception {
        final ObjectMapper mapper = new ObjectMapper();
        mapper.readValue(STRING_CATEGORY_VALUES, ModelData.class);
    }
}
