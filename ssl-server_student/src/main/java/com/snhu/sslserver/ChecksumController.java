package com.snhu.sslserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@RestController
public class ChecksumController {

    @GetMapping("/hash")
    public String getCheckSum() {
        String data = "Hello Mario Frederick!";
        String checksum = generateSHA256Checksum(data);
        return "Data: " + data + "<br>SHA-256 Checksum: " + checksum;
    }

    private String generateSHA256Checksum(String data) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = digest.digest(data.getBytes());
            // Convert bytes to hex string
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                String hex = Integer.toHexString(0xff & b);
                if(hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            return "Error: SHA-256 algorithm not found";
        }
    }
}