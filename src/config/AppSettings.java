package edu.cam.config;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public final class AppSettings {
    private static final AppSettings INSTANCE = new AppSettings();
    private final Path basePath;
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");

    private AppSettings() {
        this.basePath = Paths.get(System.getProperty("user.dir"), "data");
    }

    public static AppSettings get(){ return INSTANCE; }
    public Path getBasePath(){ return basePath; }
    public String now(){ return LocalDateTime.now().format(formatter); }
}
