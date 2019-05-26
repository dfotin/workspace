package com.edu.ocp.nio;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.attribute.UserPrincipal;

public class App01 {
    public static void main(String[] args) throws IOException {
        UserPrincipal owner = FileSystems.getDefault().getUserPrincipalLookupService().lookupPrincipalByName("ukropchik");
        System.out.println(owner);
    }
}
