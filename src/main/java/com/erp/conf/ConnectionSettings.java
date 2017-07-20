package com.erp.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "connection")
public class ConnectionSettings
{
    private String alloworigin_cors_a;
    private Boolean isProxy; 
    private String url;
    private Integer port;
    private String username;
    private String password;

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public Integer getPort()
    {
        return port;
    }

    public void setPort(Integer port)
    {
        this.port = port;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getAlloworigin_cors_a()
    {
        return alloworigin_cors_a;
    }

    public void setAlloworigin_cors_a(String alloworigin_cors_a)
    {
        this.alloworigin_cors_a = alloworigin_cors_a;
    }

    public Boolean getIsProxy()
    {
        return isProxy;
    }

    public void setIsProxy(Boolean isProxy)
    {
        this.isProxy = isProxy;
    }

}
