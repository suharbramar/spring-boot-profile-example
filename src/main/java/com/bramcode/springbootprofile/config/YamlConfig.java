package com.bramcode.springbootprofile.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties("server")
public class YamlConfig {
    private String email;
    private List<Cluster> cluster;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Cluster> getCluster() {
        return cluster;
    }

    public void setCluster(List<Cluster> cluster) {
        this.cluster = cluster;
    }

    @Override
    public String toString() {
        return "YamlConfig{" +
                "email='" + email + '\'' +
                ", cluster=" + cluster +
                '}';
    }

    public static class Cluster{
        private String ip;
        private String path;

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        @Override
        public String toString() {
            return "Cluster{" +
                    "ip='" + ip + '\'' +
                    ", path='" + path + '\'' +
                    '}';
        }
    }
}
