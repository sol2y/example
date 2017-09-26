
package com.apress.isf.spring.service;

import com.apress.isf.java.model.Document;
import com.apress.isf.java.model.Type;
import com.apress.isf.java.service.SearchEngine;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Profile("qa")
public class FileSearchEngineService implements SearchEngine {

    public List<Document> findByType(Type documentType) {
        throw new UnsupportedOperationException(
                "QA Environment. Not yet implemented operation.");
    }

    public List<Document> listAll() {
        throw new UnsupportedOperationException(
                "QA Environment. Not yet implemented operation.");
    }

}