package com.microsoft.uploadissue;

import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.BlobContainerClientBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Service
public class BlobService {

    private final BlobContainerClient containerClient;

    @Autowired
    public BlobService(
            @Value("${azure.storage.connection.string}") String azureConnectionString,
            @Value("${azure.storage.name}") String storageName) {

        this.containerClient = new BlobContainerClientBuilder()
                .connectionString(azureConnectionString)
                .containerName(storageName)
                .buildClient();
    }

    public void upload(MultipartFile file) {
        try {
            var path = "test/test";

            var blobClient = containerClient.getBlobClient(path);

            blobClient.upload(new BufferedInputStream(file.getInputStream()), file.getSize(), true);

            Map<String, String> blobTags = new HashMap<>(1);
            blobTags.put("filename", file.getOriginalFilename());
            blobClient.setTags(blobTags);
            blobClient.setMetadata(blobTags);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
