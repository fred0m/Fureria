package com.fredom.fureria.bean;

import lombok.Data;

@Data
public class SystemInfoBean {
    private String fureriaVerion;
    private String javaVersion;
    private String javaVendor;
    private String javaVMName;
    private String javaVMVersion;
    private String javaVMVendor;
    private String osName;
    private String osVersion;
}
